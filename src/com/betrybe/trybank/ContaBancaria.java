package com.betrybe.trybank;

public class ContaBancaria {
    // atributos
    double saldo;

    // construtor
    public ContaBancaria(double saldo) {
        this.saldo = saldo;
    }

    // métodos
    void mostraMensagem() {
        // não recebe nenhum parâmetro e nem retorna um valor (void)
        System.out.println("Conta bancária acessada.");
    }

    void depositar(double valor) {
        // recebe um parâmetro do tipo double e não retorna um valor (void)
        this.saldo += valor;
        // palavra-chave this para indicar que queremos acessar o atributo saldo do objeto
    }

    double converteMoeda(float total, float cambio) {
        // recebe dois parâmetros do tipo float e retorna um valor do tipo double
        return total * cambio;
    }

}
