package br.uniesp.poo.lista01.Q3;

/*Uma empresa decidiu dar 20% de aumento aos funcionários cujos salários são
inferiores a 500 reais. Escreva um programa que leia o salário de vários
funcionários se mostre o valor do salário reajustado ou uma mensagem caso o
funcionário não tenha direito ao aumento. O programa será encerrado quando se
digitar “fim” para o nome do funcionário. (Comando while)*/

import java.util.Scanner;

public class Q3 {

    public static void main(String[] args) {

        String nome = null;
        Double salario = 0.00;
        Double salarioAjustado = 0.00;
        Boolean flag = true;
        String opcao = null;

        int i = 0;

        Scanner leitor = new Scanner(System.in);
        while (flag) {
            System.out.println("Nome do funcionario: ");
            nome = leitor.next();
            System.out.println("Digite o seu salario: ");
            salario = leitor.nextDouble();
            if (salario > 500) {
                System.out.println("Funcionario não tem direito ao aumento");
            }else {
                salarioAjustado = salario + 0.20;
            }
            System.out.println("Nome do funcionario: " + nome);
            System.out.println("Salario atual: R$" + salario);
            System.out.println("Salario ajustado: R$" + salarioAjustado);
            System.out.println("Deseja continuar S/FIM: \n");;
            opcao = leitor.next();
            if (opcao.equals("FIM") || opcao.equals("fim") )  {
                break;
            }

        }

        System.out.println("Programa encerrado com sucesso!");
        System.exit(0);

    }
}