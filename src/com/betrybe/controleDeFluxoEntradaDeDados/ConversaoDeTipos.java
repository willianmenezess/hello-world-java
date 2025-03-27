package com.betrybe.controleDeFluxoEntradaDeDados;

public class ConversaoDeTipos {
    public static void Main(String[] args) {
        // Conversão de tipos
        // Conversão de tipos é a maneira de converter um tipo de dado em outro tipo de dado.
        // Existem dois tipos de conversão de tipos:
        // Conversão implícita (conversão automática) - feita pelo compilador.
        // Conversão explícita (conversão manual) - feita pelo programador.

        // Conversão implícita
        // A conversão implícita é feita pelo compilador.
        // O compilador faz a conversão de tipos automaticamente quando o tipo de dado de menor precisão é convertido para o tipo de dado de maior precisão.
        // Exemplo:
        int numeroInteiro = 10;
        double numeroDecimal = numeroInteiro; // Conversão implícita
        System.out.println(numeroDecimal); // 10.0

        // Conversão explícita
        // A conversão explícita é feita pelo programador.
        // O programador faz a conversão de tipos manualmente quando o tipo de dado de maior precisão é convertido para o tipo de dado de menor precisão.
        // Exemplo:
        double numeroDecimal2 = 10.5;
        int numeroInteiro2 = (int) numeroDecimal2; // Conversão explícita
        System.out.println(numeroInteiro2); // 10
    }
}
