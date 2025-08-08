package com.betrybe.controleDeFluxoEntradaDeDados;

public class EstruturaDeRepeticaoFor {
    //  A grande diferença entre FOR (‘Para’) e WHILE (‘Enquanto’) é que no FOR você precisa ter uma previsibilidade
    //  de número de ocorrências, diferente do WHILE, que prossegue enquanto alguma condição for verdadeira (true).
    //  O comando FOR faz parte da estrutura de fluxo de repetição.

    // atributos
    int numero;
    String log;
    // Cria um vetor com 4 alunos
    String[] alunos;
    String log2;
    int matricula;
    int posicao;
    int totalAlunos;

    // metodos
    public void estruturaFor() {
        for (int i = 0; i < 10; i++) {
            numero = i;
            log = "O Número atual é: " + numero + "\n";
            System.out.println(log);
        }
    }

    public void estruturaForComArrays(String[] alunos) {
        this.alunos = alunos;
        // Pega o total de alunos existentes no vetor
        totalAlunos = alunos.length;

        // Nossa variável 'log' não é muito útil agora, mas serve para registrarmos o que está acontecendo!
        log2 = "A lista de chamadas possui " + totalAlunos + " alunos\n";

        // Imprime a lista de chamadas. Note que você pode declarar a variável posição dentro do for!
        for (posicao = 0; posicao < totalAlunos; posicao++) {
            matricula = posicao + 1;
            log2 = "Matricula: " + matricula + " Aluno: " + alunos[posicao] + "\n";
            System.out.println(log2);
        }
    }

    //metodo main
    public static void main(String[] args) {
        EstruturaDeRepeticaoFor estruturaDeRepeticaoFor = new EstruturaDeRepeticaoFor();
        estruturaDeRepeticaoFor.estruturaFor();
        String[] alunos = { "MARCOS", "ALINE", "LUCAS", "PATRICIA" };
        estruturaDeRepeticaoFor.estruturaForComArrays(alunos);
    }
}

