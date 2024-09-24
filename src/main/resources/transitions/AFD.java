package main.resources.transitions;

import java.util.HashSet;
import java.util.Set;

public abstract class AFD {

    protected State currentState;
    protected int stateIndex = 0;
    protected Set<State> finalStates = new HashSet<State>();
    protected int limitWord;
    protected String alphabet;
    protected State[][] transitionTable;

    public boolean verify(String word){
        if (word.length() > limitWord) return false;
        initAFD();
        for(int i = 0; i<word.length(); i++){
            char c = word.charAt(i);
            if(!alphabetContains(c)) return false;
            int symbol = getSymbol(c);
            currentState = transitionTable[stateIndex][symbol];
            if (i == word.length()-1 && !finalStates.contains(currentState)) return false;
            stateIndex++;
        }
        return true;
    }

    protected void initAFD(){
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

    protected abstract State setInitState();
    protected abstract int setLimitWord();
    protected abstract Set<State> setFinalStates();
    protected abstract String setAlphabet();
    protected abstract State[][] setTransitionTable();

}
