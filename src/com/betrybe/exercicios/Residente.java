package com.betrybe.exercicios;

public class Residente {
    // Atributos demais
    public String nome;
    public int idade;
    public double peso;
    public double altura;

    // Metodo Construtor
    public Residente (String nome, int idade, double peso, double altura) {
        this.nome = nome;
        this.idade = idade;
        this.peso = peso;
        this.altura = altura;
    }

    public static void Main(String[] args) {
        Residente residente = new Residente("João", 25, 70.0, 1.75);
        System.out.println(residente.nome); // João
        System.out.println(residente.idade); // 25
        System.out.println(residente.peso); // 70.0
        System.out.println(residente.altura); // 1.75
    }
}

