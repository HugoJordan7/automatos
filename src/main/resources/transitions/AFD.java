package main.resources.transitions;

import java.util.Set;

public abstract class AFD {

    private State initState;
    private Set<State> finalStates;

    public AFD(){
        initState = getInitialState();
        finalStates = getFinalStates();
    }

    abstract State getInitialState();
    abstract Set<State> getFinalStates();
}
