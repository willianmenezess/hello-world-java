package com.betrybe.trybank;

public class Banco {

    public static void main(String[] args) {
        // A variável conta é do tipo ContaBancaria, que é um tipo não primitivo.
        // Conta com saldo inicial de R$1000
        ContaBancaria conta = new ContaBancaria(1000);
        // A variável conta referencia um novo objeto, que é a instância da classe ContaBancaria.

        conta.mostraMensagem();
        // Agora o saldo será de R$ 1500
        conta.depositar(500);

        double valorConvertido = conta.converteMoeda(30, 5);
    }
}
