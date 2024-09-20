package main.resources.transitions;

import java.util.HashSet;
import java.util.Set;

public class CpfAFD extends AFD {

    private State q0 = new State(0);
    private State q1 = new State(1);
    private State q2 = new State(2);
    private State q3 = new State(3);
    private State q4 = new State(4);
    private State q5 = new State(5);
    private State q6 = new State(6);
    private State q7 = new State(7);
    private State q8 = new State(8);
    private State q9 = new State(9);
    private State q10 = new State(10);
    private State q11 = new State(11);
    private State q12 = new State(12);
    private State q13 = new State(13);
    private State q14 = new State(14);

    // "." = 10 & "-" = 11

    private State[][] transition = {
            {q1,q1,q1,q1,q1,q1,q1,q1,q1,q1,null,null}, // q0
            {q2,q2,q2,q2,q2,q2,q2,q2,q2,q2,null,null}, // q1
            {q3,q3,q3,q3,q3,q3,q3,q3,q3,q3,null,null}, // q2
            {null,null,null,null,null,null,null,null,null,null,q4,null}, // q3
            {q5,q5,q5,q5,q5,q5,q5,q5,q5,q5,null,null}, // q4
            {q6,q6,q6,q6,q6,q6,q6,q6,q6,q6,null,null}, // q5
            {q7,q7,q7,q7,q7,q7,q7,q7,q7,q7,null,null}, // q6
            {null,null,null,null,null,null,null,null,null,null,q8,null}, // q7
            {q9,q9,q9,q9,q9,q9,q9,q9,q9,q9,null,null}, // q8
            {q10,q10,q10,q10,q10,q10,q10,q10,q10,q10,null,null}, // q9
            {q11,q11,q11,q11,q11,q11,q11,q11,q11,q11,null,null}, // q10
            {null,null,null,null,null,null,null,null,null,null,null,q12}, // q11
            {q13,q13,q13,q13,q13,q13,q13,q13,q13,q13,null,null}, // q12
            {q14,q14,q14,q14,q14,q14,q14,q14,q14,q14,null,null}, // q13
            {null,null,null,null,null,null,null,null,null,null,null,null}, // q14
    };


    @Override
    State getInitialState() {
        return q0;
    }

    @Override
    Set<State> getFinalStates() {
        Set<State> finalStates = new HashSet<>();
        finalStates.add(q0);
        return finalStates;
    }
}
