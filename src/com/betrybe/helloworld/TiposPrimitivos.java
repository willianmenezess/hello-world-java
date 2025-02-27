package com.betrybe.helloworld;

public class TiposPrimitivos {

    public static void main(String[] args) {
        // representação de dados (áudios, textos, vídeos e etc.) realizada por computadores
        // é o resultado de várias combinações de bits.
        byte b = 9; // 8 bits
        System.out.println(b);

        // short são numéricas com intervalo válido entre -32768 até 32767. São utilizados
        // quando queremos criar algoritmos com uma interação de valores numéricos não muito grandes.
        short num = 300;
        short formatadaComUnderscore = 20_000; // variável
        // números podem conter o símbolo _ (underscore) para facilitar a leitura.
        // É isso que estamos fazendo com a variável formatadaComUnderscore.
        System.out.println(num);
        System.out.println(formatadaComUnderscore); // 20000

        // O int é um tipo primitivo numérico que aceita valores de -2.147.483.648 até 2.147.483.647.
        // Variáveis de tipo inteiro são amplamente utilizadas para resolver problemas com algoritmos.
        int numeroInteiro = 10;
        int a = 10, c = 20, soma; // inicialização de variáveis inline
        soma = a + c; // atribuição da soma da variável a + b para a variável soma
        System.out.println(numeroInteiro); // 10
        System.out.println(soma); // 30

        // O long é um tipo primitivo numérico de range -9.223.372.036.854.775.808 até 9.223.372.036.854.775.807.
        // Esse é o tipo que armazena a maior quantidade de números inteiros (sem casas decimais).
        long numA = 102040;
        long numB = 102030405060L; // adicionado L no final para indicar que estamos inserindo um valor do tipo long
        System.out.println(numA);
        System.out.println(numB);
    }
}
