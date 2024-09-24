package main.resources.transitions;

import java.util.HashSet;
import java.util.Set;

public class CpfAFNe extends AFNe{

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
    protected State q15 = new State(15);

    @Override
    protected State[][][] setTransitionTable() {
         State[][][] transitionTable = {
                 //Cada linha contem a lista de transições de um estado qualquer
                 //Cada coluna é referente a uma letra do alfabeto, exceto a última que é a coluna de transições vazias
                {{q1}, {q1}, {q1}, {q1}, {q1}, {q1}, {q1}, {q1}, {q1}, {q1}, null, null, null}, // q0
                {{q2}, {q2}, {q2}, {q2}, {q2}, {q2}, {q2}, {q2}, {q2}, {q2}, null, null, null}, // q1
                {{q3}, {q3}, {q3}, {q3}, {q3}, {q3}, {q3}, {q3}, {q3}, {q3}, null, null, null}, // q2
                {null, null, null, null, null, null, null, null, null, null, {q4}, null, null}, // q3
                {{q5}, {q5}, {q5}, {q5}, {q5}, {q5}, {q5}, {q5}, {q5}, {q5}, null, null, null}, // q4
                {{q6}, {q6}, {q6}, {q6}, {q6}, {q6}, {q6}, {q6}, {q6}, {q6}, null, null, null}, // q5
                {{q7}, {q7}, {q7}, {q7}, {q7}, {q7}, {q7}, {q7}, {q7}, {q7}, null, null, null}, // q6
                {null, null, null, null, null, null, null, null, null, null, {q8}, null, null}, // q7
                {{q9}, {q9}, {q9}, {q9}, {q9}, {q9}, {q9}, {q9}, {q9}, {q9}, null, null, null}, // q8
                {{q10}, {q10}, {q10}, {q10}, {q10}, {q10}, {q10}, {q10}, {q10}, {q10}, null, null, null}, // q9
                {{q11}, {q11}, {q11}, {q11}, {q11}, {q11}, {q11}, {q11}, {q11}, {q11}, null, null, null}, // q10
                {null, null, null, null, null, null, null, null, null, null, null, {q12}, null}, // q11
                {{q13}, {q13}, {q13}, {q13}, {q13}, {q13}, {q13}, {q13}, {q13}, {q13}, null, null, null}, // q12
                {{q14, q15}, {q14, q15}, {q14, q15}, {q14, q15}, {q14, q15}, {q14, q15}, {q14, q15}, {q14, q15}, {q14, q15}, {q14, q15}, null, null, null}, // q13
                {null, null, null, null, null, null, null, null, null, null, null, null, null}, // q14
                {null, null, null, null, null, null, null, null, null, null, null, null, {q14}}, // q15
        };
        return transitionTable;
    }

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
