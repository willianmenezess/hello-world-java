package com.betrybe.controleDeFluxoEntradaDeDados;

public class EstruturasCondicionais {
    public String resultado;
    public double mediaFinal;

    public void mediaFinal(double mediaFinal) {
        this.mediaFinal = mediaFinal;
    }

    public void resultado() {
        if (this.mediaFinal >= 7) {
            this.resultado = "Aprovado";
        } else if (this.mediaFinal >= 5) {
            this.resultado = "Recuperação";
        } else {
            this.resultado = "Reprovado";
        }
    }

    public static void main(String[] args) {
        EstruturasCondicionais aluno = new EstruturasCondicionais();
        aluno.mediaFinal(6.5);
        aluno.resultado();
        System.out.println(aluno.resultado); // Recuperação
    }

}
