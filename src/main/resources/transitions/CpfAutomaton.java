package main.resources.transitions;

import java.util.HashSet;
import java.util.Set;

public abstract class CpfAutomaton extends Automaton {

    protected State q0 = new State(0);
    protected State q1 = new State(1);
    protected State q2 = new State(2);
    protected State q3 = new State(3);
    protected State q4 = new State(4);
    protected State q5 = new State(5);
    protected State q6 = new State(6);
    protected State q7 = new State(7);
    protected State q8 = new State(8);
    protected State q9 = new State(9);
    protected State q10 = new State(10);
    protected State q11 = new State(11);
    protected State q12 = new State(12);
    protected State q13 = new State(13);
    protected State q14 = new State(14);

    public abstract boolean verify(String word);

    @Override
    protected State setInitState() {
        return q0;
    }

    @Override
    protected int setLimitWord() {
        return 14;
    }

    @Override
    protected Set<State> setFinalStates() {
        Set<State> finalStates = new HashSet<State>();
        finalStates.add(q14);
        return finalStates;
    }

    @Override
    protected String setAlphabet() {
        return "0123456789.-";
    }
}
