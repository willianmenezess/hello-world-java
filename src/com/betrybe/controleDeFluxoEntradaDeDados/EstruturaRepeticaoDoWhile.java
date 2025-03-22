package com.betrybe.controleDeFluxoEntradaDeDados;
import java.util.Random;

//Semelhante ao WHILE (‘Enquanto’), o DO WHILE (‘Faça Enquanto’) garante que, sempre, ao menos uma
// iteração do loop será executada, já que ele primeiro executa e apenas depois valida se a condição
// é verdadeira para continuar ou falsa para interromper o processo.

public class EstruturaRepeticaoDoWhile {
    public static void main(String[] args) {

        int tentativas = 0;
        int atendeu = 0;
        String log;

        do {
            log = "Ligando para candidato selecionado ...\n";
            // O código abaixo nos dá um numero aleatório entre 0 e 2.
            atendeu = new Random().ints(0, 2).findFirst().getAsInt();
            tentativas += 1;
        } while (atendeu == 0 && tentativas < 3);

        log = "Candidato atendeu na tentativa: " + tentativas;
        System.out.println(log);
    }
}
