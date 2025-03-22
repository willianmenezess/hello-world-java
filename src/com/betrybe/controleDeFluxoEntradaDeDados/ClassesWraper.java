package com.betrybe.controleDeFluxoEntradaDeDados;

// A classe wrapper nada mais é que uma classe que nos permite usar os tipos primitivos como objetos.

// Parte integrante da plataforma Java, não precisa importar.

// Uma das maiores vantagens de usar os objetos dos tipos primitivos, providos pelas classes wrapper,
// é o acesso a diversos métodos que são disponibilizados para eles.

// O tipo primitivo int possui uma classe wrapper associada chamada Integer.

// As classes wrapper são usadas principalmente em situações em que os tipos primitivos de dados
// precisam ser tratados como objetos. Classes Wrapper também fornecem métodos úteis para manipulação de dados.

public class ClassesWraper {
    public static void main(String[] args) {
        Integer valor = 7;  // autoboxing (autoempacotamento)
        //  Integer valor2 = new Integer(7); // forma antiga de fazer autoboxing

        int outroValor = valor; // unboxing (desempacotamento)

        // utilizamos o metodo toBinaryString da classe Integer para converter o número inteiro
        // numa representação binária.
        System.out.println(
                Integer.toBinaryString(valor)
        );
    }
}


//Existem os seguintes tipos de classes wrapper (não primitivos e seus primitivos correspondentes):
//byte b = 10; Byte b = 10;
//short s = 10; Short s = 10;
//int i = 10; Integer i = 10;
//long l = 10; Long l = 10;
//float f = 10.0f; Float f = 10.0f;
//double d = 10.0; Double d = 10.0;
//char c = 'a'; Character c = 'a';
//boolean b = true; Boolean b = true;

// Tbm existem classes wrapper para String, Array, Class, Interface, Enum, Void, Number, Throwable, Exception,
// RuntimeException, Error, StackTraceElement, Thread, ThreadGroup, Process, ProcessBuilder,
// Runtime, SecurityManager, Package, Void, Character.Subset, Character.UnicodeBlock, etc.
