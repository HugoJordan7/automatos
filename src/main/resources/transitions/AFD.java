package main.resources.transitions;

public abstract class AFD extends Automaton<State[][]>{

    public boolean verify(String word){
        if (word.length() > limitWord) return false;
        initAutomaton();
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

}
