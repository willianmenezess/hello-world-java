package com.betrybe.controleDeFluxoEntradaDeDados;
import java.util.Scanner;

class UsandoScanner {

    // recebe o nome do usuário por input e imprime uma mensagem de boas-vindas
    public void scannerBoasVindas() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Qual o seu nome: ");
        String nome = scanner.next();
        System.out.println("Boas-vindas, " + nome + "!");
        scanner.close();
    }

    public void scannerConverteStringParaInt() {
        // recebe um número inteiro por input e imprime o número. Deve-se converter o input para int.
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um número inteiro: ");
        String input1 = scanner.next();
        // Converte a string para int. ParseInt é um metodo estático da classe Integer, por isso
        // não precisa instanciar um objeto Integer para usá-lo.
        int numeroInt = Integer.parseInt(input1); // poderia converter, por ex, para double com Double.parseDouble(input1);
        System.out.println("O número digitado foi: " + numeroInt);
        scanner.close();
    }

    public static void main(String[] args) {
        UsandoScanner usandoScanner = new UsandoScanner();
        usandoScanner.scannerBoasVindas();
        usandoScanner.scannerConverteStringParaInt();
    }
}
