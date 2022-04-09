package br.uniesp.poo.lista02;

/* ATIVIDADE 2
nomeUsuario, idade, valorEmprestimo, percentualJurosMes, mesesParaPagar.
Este método não retorna valor e deverá exibir na tela todos os atributos da classe empréstimo.
calcularEmprestimo
O valor do empréstimo é calculado seguindo a seguintes regras: caso a idade seja maior ou igual a 18 e menor do que 23,
use a fórmula: valorEmprestimo += (valorEmprestimo / mesesParaPagar) / * percentualJurosMes,
quando for superior a 23 e menor ou igual a 33, use a fórmula (valorEmprestimo * 10)/100
*/

import java.text.BreakIterator;
import java.util.Scanner;

public class Emprestimo {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);
        String nomeUsuario = null;
        int idade = 0;
        double valorEmprestimo = 0;
        double percentualJurosMes = 0;
        double mesesParaPagar = 0;
        double calcularEmprestimo = 0;


        System.out.println("Nome do usuário: ");
        nomeUsuario = leitor.next();
        System.out.println("Idade do usuário: ");
        idade = leitor.nextInt();
        if (idade < 18){
            System.out.println("IDADE NÃO PERMITIDA");
        } else {
            System.out.println("Valor do emprestimo: ");
            valorEmprestimo = leitor.nextDouble();
            System.out.println("Percentual de juros: ");
            percentualJurosMes = leitor.nextDouble();
            System.out.println("Meses para pagar: ");
            mesesParaPagar = leitor.nextDouble();

            if ((idade >= 18) && (idade <= 23)) {
                calcularEmprestimo = (valorEmprestimo / mesesParaPagar) * (percentualJurosMes / 100);
                ++calcularEmprestimo;
            } else {
                if ((idade >= 23) && (idade <= 33)) {
                    calcularEmprestimo = (valorEmprestimo * 10) / 100;
                    ++calcularEmprestimo;
                }
            }
            System.out.println("Nome: " + nomeUsuario);
            System.out.println("Idade:" + idade);
            System.out.println("Valor do emprestimo: R$ " + valorEmprestimo);
            System.out.println("Percentual de juros: " + percentualJurosMes);
            System.out.println("Meses para pagar: " + mesesParaPagar);
            System.out.println("Calculo do emprestimo:" + calcularEmprestimo);
        }


    }
}

