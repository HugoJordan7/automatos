package main.resources.transitions;

import java.util.Scanner;

public class Main {

    public static Scanner sc = new Scanner(System.in);

    public static AFD afd = new CpfAFD();
    public static AFNe afne = new CpfAFNe();

    public static void main(String[] args) {
        String email = "";
        do {
            System.out.print("Digite um CPF ou enter para parar: ");
            email = sc.nextLine();
            if(!email.isEmpty()) {
                if(afne.verify(email)){
                    System.out.println("\033[32m" + "CPF válido!\n" + "\033[0m");
                }else {
                    System.out.println("\033[31m" + "CPF inválido!\n" + "\033[0m");
                }
            }
        } while(!email.isEmpty());
    }

}
