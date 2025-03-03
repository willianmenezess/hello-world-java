package com.betrybe.exercicios;
//importando o Math para usar o método pow
import java.lang.Math;


public class Residente {
    // Atributos
    public String nome;
    public int idade;
    public double peso;
    public double altura;
    public double imc;

    // Metodo Construtor
    public Residente(String nome, int idade, double peso, double altura) {
        this.nome = nome;
        this.idade = idade;
        this.peso = peso;
        this.altura = altura;
    }

    public double calcularImc() {
        return this.peso / Math.pow(this.altura, 2);
    }

    public static void main(String[] args) {
        Residente residente = new Residente("João", 25, 70.0, 1.75);
        System.out.println(residente.nome); // João
        System.out.println(residente.idade); // 25
        System.out.println(residente.peso); // 70.0
        System.out.println(residente.altura); // 1.75
        System.out.println("O IMC de " + residente.nome + " é: " + residente.calcularImc()); // O IMC de João é: 22.857142857142858
    }
}

