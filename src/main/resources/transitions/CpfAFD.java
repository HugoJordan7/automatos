package main.resources.transitions;

public class CpfAFD extends CpfAutomaton {

    private State[][] transitionTable = {
        {q1, q1, q1, q1, q1, q1, q1, q1, q1, q1, null, null}, // q0
        {q2, q2, q2, q2, q2, q2, q2, q2, q2, q2, null, null}, // q1
        {q3, q3, q3, q3, q3, q3, q3, q3, q3, q3, null, null}, // q2
        {null, null, null, null, null, null, null, null, null, null, q4, null}, // q3
        {q5, q5, q5, q5, q5, q5, q5, q5, q5, q5, null, null}, // q4
        {q6, q6, q6, q6, q6, q6, q6, q6, q6, q6, null, null}, // q5
        {q7, q7, q7, q7, q7, q7, q7, q7, q7, q7, null, null}, // q6
        {null, null, null, null, null, null, null, null, null, null, q8, null}, // q7
        {q9, q9, q9, q9, q9, q9, q9, q9, q9, q9, null, null}, // q8
        {q10, q10, q10, q10, q10, q10, q10, q10, q10, q10, null, null}, // q9
        {q11, q11, q11, q11, q11, q11, q11, q11, q11, q11, null, null}, // q10
        {null, null, null, null, null, null, null, null, null, null, null, q12}, // q11
        {q13, q13, q13, q13, q13, q13, q13, q13, q13, q13, null, null}, // q12
        {q14, q14, q14, q14, q14, q14, q14, q14, q14, q14, null, null}, // q13
        {null, null, null, null, null, null, null, null, null, null, null, null}, // q14
    };

    @Override
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

}
