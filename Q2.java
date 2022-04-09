package br.uniesp.poo.lista01.Q2;

import java.util.Scanner;

public class Q2 {

    public void parImpar(){
        Scanner leitor = new Scanner(System.in);
        int contador = 0;
        int valor;
        while (contador <10){
            System.out.println("Informe o valor verificador");
            valor = leitor.nextInt();
            if(valor % 2 ==0){
                System.out.println("Par");
            }else{
                System.out.println("Impar");
            }

            contador ++;
        }

    }
}
