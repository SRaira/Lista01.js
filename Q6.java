package br.uniesp.poo.lista01.Q6;

import java.util.Scanner;

public class Q6 {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);
        int totalAlunosReprovados = 0;
        int totalAlunosAprovados = 0;
        float notaUm;
        float notaDois;
        float media = 0;
        for (int x=1; x < 7; x++){
            System.out.println("Dados do Aluno"+ x);
            System.out.println("Informe a nota1: ");
            notaUm = leitor.nextFloat();
            System.out.println("Informe a nota2: ");
            notaDois = leitor.nextFloat();
            media = (notaUm + notaDois) / 2;

            if (media >= 7){
                ++totalAlunosAprovados;
            } else {
                ++totalAlunosReprovados;
            }
        }
        System.out.println("Total de alunos APROVADOS: " + totalAlunosAprovados);
        System.out.println("Total de alunos REPROVADOS: " + totalAlunosReprovados);
        System.out.println("Total de alunos do exame: " + (totalAlunosAprovados + totalAlunosAprovados));
        System.out.println("Media dos Alunos: " + media);
    }
}
