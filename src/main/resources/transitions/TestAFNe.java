package main.resources.transitions;

import java.util.HashSet;
import java.util.Set;

public class TestAFNe extends AFNe{

    protected State q0 = new State(0);
    protected State q1 = new State(1);
    protected State q2 = new State(2);

    @Override
    protected State[][][] setTransitionTable() {
        State[][][] transitionTable = {
                {{q0}, null, null, {q1}}, // q0
                {null, {q1}, null, {q2}}, // q1
                {null, null, {q2}, null}, // q2
        };
        return transitionTable;
    }

    @Override
    protected State setInitState() {
        return q0;
    }

    @Override
    protected int setLimitWord() {
        return 100;
    }

    @Override
    protected Set<State> setFinalStates() {
        Set<State> finalStates = new HashSet<State>();
        finalStates.add(q2);
        return finalStates;
    }

    @Override
    protected String setAlphabet() {
        return "abc";
    }

}
