package main.resources.transitions;

import java.util.HashSet;
import java.util.Set;

public abstract class Automaton<T> {

    protected State currentState;
    protected int stateIndex = 0;
    protected Set<State> finalStates = new HashSet<State>();
    protected int limitWord;
    protected String alphabet;
    protected T transitionTable;

    public Automaton(){
        initAutomaton();
    }

    protected abstract T setTransitionTable();
    protected abstract State setInitState();
    protected abstract int setLimitWord();
    protected abstract Set<State> setFinalStates();
    protected abstract String setAlphabet();

    public abstract boolean verify(String word);

    protected void initAutomaton(){
        currentState = setInitState();
        limitWord = setLimitWord();
        finalStates = setFinalStates();
        stateIndex = 0;
        alphabet = setAlphabet();
        transitionTable = setTransitionTable();
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
}
