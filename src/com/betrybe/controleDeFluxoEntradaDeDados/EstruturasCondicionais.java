package com.betrybe.controleDeFluxoEntradaDeDados;

public class EstruturasCondicionais {
    public String resultado;
    public double mediaFinal;

    public void mediaFinal(double mediaFinal) {
        this.mediaFinal = mediaFinal;
    }

    public void resultado() {
        if (mediaFinal >= 7) {
            resultado = "Aprovado";
        } else if (mediaFinal >= 5) {
            resultado = "Recuperação";
        } else {
            resultado = "Reprovado";
        }
    }

    public static void main(String[] args) {
        EstruturasCondicionais aluno = new EstruturasCondicionais();
        aluno.mediaFinal(6.5);
        aluno.resultado();
        System.out.println(aluno.resultado); // Recuperação
    }

}
