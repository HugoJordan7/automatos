package main.resources.transitions;

import java.util.*;

public abstract class AFNe extends Automaton<State[][][]>{

    protected State[][] epsilonTransitions;

    protected abstract State[][] setEpsilonTransitions();

    @Override
    protected void initAutomaton() {
        super.initAutomaton();
        epsilonTransitions = setEpsilonTransitions();
    }

    public boolean verify(String word) {
        if (word.length() > limitWord) return false;
        initAutomaton();
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