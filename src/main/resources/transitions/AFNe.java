package main.resources.transitions;

import java.util.*;

public abstract class AFNe {

    protected State currentState;
    protected int stateIndex = 0;
    protected Set<State> finalStates = new HashSet<State>();
    protected int limitWord;
    protected String alphabet;
    protected State[][][] transitionTable;
    protected State[][] epsilonTransitions;

    public AFNe(){
        initAFNe();
    }

    protected abstract State setInitState();
    protected abstract int setLimitWord();
    protected abstract Set<State> setFinalStates();
    protected abstract String setAlphabet();
    protected abstract State[][][] setTransitionTable();
    protected abstract State[][] setEpsilonTransitions();

    protected void initAFNe(){
        currentState = setInitState();
        limitWord = setLimitWord();
        finalStates = setFinalStates();
        stateIndex = 0;
        alphabet = setAlphabet();
        transitionTable = setTransitionTable();
        epsilonTransitions = setEpsilonTransitions();
    }

    protected int getSymbol(char c){
        for(int i = 0; i< alphabet.length(); i++){
            if (alphabet.charAt(i) == c) return i;
        }
        return -1;
    }

    protected boolean alphabetContains(char c){
        return alphabet.contains(""+c);
    }

    public boolean verify(String word) {
        if (word.length() > limitWord) return false;
        initAFNe();
        Set<State> currentStates = new HashSet<>();
        currentStates.add(currentState);
        currentStates.addAll(epsilonClosure(currentState));
        for (int i = 0; i < word.length(); i++) {
            char c = word.charAt(i);
            if (!alphabetContains(c)) return false;
            int symbol = getSymbol(c);
            Set<State> nextStates = new HashSet<>();
            for (State state : currentStates) {
                if (transitionTable[state.getNumberName()][symbol] != null) {
                    for (State nextState : transitionTable[state.getNumberName()][symbol]) {
                        nextStates.add(nextState);
                        nextStates.addAll(epsilonClosure(nextState));
                    }
                }
            }
            if (nextStates.isEmpty()) return false;
            currentStates = nextStates;
        }
        for (State state : currentStates) {
            if (finalStates.contains(state)) return true;
        }
        return false;
    }

    private Set<State> epsilonClosure(State state) {
        Set<State> closure = new HashSet<>();
        closure.add(state);
        for (State nextState : epsilonTransitions[state.getNumberName()]) {
            if (!closure.contains(nextState)) {
                closure.addAll(epsilonClosure(nextState));
            }
        }
        return closure;
    }

}
