package main.resources.recursive;

import java.util.Scanner;

public class Main {

    public static Scanner sc = new Scanner(System.in);

    public static AFD afd = new AFD();
    public static AFNe afne = new AFNe();

    public static void main(String[] args) {
        String email = "";
        do {
            System.out.print("Digite um email ou enter para parar: ");
            email = sc.nextLine();
            if(!email.isEmpty()) {
                if(afd.verify(email)){
                    System.out.println("\033[32m" + "Email válido!\n" + "\033[0m");
                }else {
                    System.out.println("\033[31m" + "Email inválido!\n" + "\033[0m");
                }
            }
        } while(!email.isEmpty());
    }

}
