package com.betrybe.controleDeFluxoEntradaDeDados;
import java.util.Scanner;

class UsandoScanner {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Qual o seu nome: ");
        String nome = scanner.next();
        System.out.println("Boas-vindas, " + nome + "!");
        scanner.close();

    }
}
