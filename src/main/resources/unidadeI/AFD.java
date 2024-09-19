package main.resources.unidadeI;

public class AFD {

    public boolean verify(String email){
        return initState(email, 0);
    }

    private boolean initState(String email, int i){
        if (i == email.length()-1) return false;
        char letraDoEmail = email.charAt(i);
        char[] transicao = "abcdefghijklmnopqrstuvwxyz0123456789".toCharArray();
        for (char c: transicao){
            if(letraDoEmail == c) return q1(email, i+1);
        }
        return false;
    }

    private boolean q1(String email, int i){
        if (i == email.length()-1) return false;
        char letraDoEmail = email.charAt(i);
        char[] transicao = "abcdefghijklmnopqrstuvwxyz0123456789".toCharArray();
        for (char c: transicao){
            if(letraDoEmail == c) return q1(email, i+1);
            else if(letraDoEmail == '@') return q2(email, i+1);
        }
        return false;
    }

    private boolean q2(String email, int i){
        if (i == email.length()-1) return false;
        char letraDoEmail = email.charAt(i);
        char[] transicao = "abcdefghijklmnopqrstuvwxyz".toCharArray();
        for (char c: transicao){
            if(letraDoEmail == c) return q2(email, i+1);
            else if(letraDoEmail == '.') return q3(email, i+1);
        }
        return false;
    }

    private boolean q3(String email, int i){
        if (i == email.length()-1) return false;
        char letraDoEmail = email.charAt(i);
        if(letraDoEmail == 'c') return q4(email, i+1);
        return false;
    }

    private boolean q4(String email, int i){
        if (i == email.length()-1) return false;
        char letraDoEmail = email.charAt(i);
        if(letraDoEmail == 'o') return q5(email, i+1);
        return false;
    }

    private boolean q5(String email, int i){
        char letraDoEmail = email.charAt(i);
        if(letraDoEmail == 'm') return endState(email, i);
        return false;
    }

    private boolean endState(String email, int i){
        return (i == email.length()-1);
    }

}
