package main.resources.transitions;

import java.util.Scanner;

public class Main {

    public static Scanner sc = new Scanner(System.in);

    public static CpfAutomaton afd = new CpfAFD();
    public static CpfAutomaton afne = new CpfAFNe();

    public static void main(String[] args) {
        String email = "";
        do {
            System.out.print("Digite um CPF ou enter para parar: ");
            email = sc.nextLine();
            if(!email.isEmpty()) {
                if(afne.verify(email)){
                    System.out.println("\033[32m" + "CPF v�lido!\n" + "\033[0m");
                }else {
                    System.out.println("\033[31m" + "CPF inv�lido!\n" + "\033[0m");
                }
            }
        } while(!email.isEmpty());
    }

}
