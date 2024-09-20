package main.resources.transitions;

import java.util.HashSet;
import java.util.Set;

public abstract class Automaton {

    protected State currentState;
    protected int stateIndex = 0;
    protected Set<State> finalStates = new HashSet<State>();
    protected int limitWord;
    protected String alphabet;

    public Automaton(){
        initAFD();
    }

    protected abstract State setInitState();

    protected abstract int setLimitWord();

    protected abstract Set<State> setFinalStates();

    protected abstract String setAlphabet();

    protected void initAFD(){
        currentState = setInitState();
        limitWord = setLimitWord();
        finalStates = setFinalStates();
        stateIndex = 0;
        alphabet = setAlphabet();
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
