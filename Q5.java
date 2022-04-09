package br.uniesp.poo.lista01.Q5;

import javax.swing.*;
import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);
        float salarioBruto;
        float valorPrestação;
        float prestacao;
        float valorMaximo;

        System.out.println("Informe o salário:");
        salarioBruto = leitor.nextFloat();
        System.out.println("Informe o valor da prestação:");
        valorPrestação = leitor.nextFloat();

        //String salario = JOptionPane.showInputDialog("Informe o salário");
        //JOptionPane.showMessageDialog(null, salarioBruto);
        //String valorPrestacao = JOptionPane.showInputDialog("Informe o valor da prestação:");
        //JOptionPane.showMessageDialog(null, valorPrestação);

        valorMaximo = salarioBruto * 0.3f;

        if (valorPrestação>valorMaximo){
            System.out.println("Empréstimo Negado");
        }else {
            System.out.println("Empréstimo Liberado");
        }
    }
}
