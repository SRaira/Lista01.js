package br.uniesp.poo.lista01.Q8;

import java.util.ArrayList;
import java.util.Scanner;

public class Paciente {

    public static void main(String[] args) {
        String nome = null;
        String sexo = null;
        Integer idade = null;
        Double altura = null;
        int peso = 0;

        int qtdePacientes = 0;
        float mediaIdadeHomens = 0;
        int qtdeMuleresAltura = 0;
        int qtdePessoasIdade = 0;

        Paciente paciente = new Paciente();
        ArrayList<Paciente> pacientesList = new ArrayList<>();
        Scanner leitor = new Scanner(System.in);
        String opcao = "S";
        int i = 1;

        while (opcao.equals("S") || opcao.equals("S")) {
            System.out.println("Digite o nome do paciente: ");
            nome = leitor.next();
            System.out.println("Digite o sexo do paciente: F/M ");
            sexo = leitor.next();
            System.out.println("Digite a idade do paciente: ");
            idade = leitor.nextInt();
            System.out.println("Digite a altura do paciente: ");
            altura = leitor.nextDouble();
            System.out.println("Digite o peso do paciente: ");
            peso = leitor.nextInt();
            pacientesList.add(paciente);
            qtdePacientes = i++;
            System.out.println("Deseja continuar o cadastro S/N: ");
            opcao = leitor.nextLine();
            if (opcao.equals("N") || opcao.equals("n")){
                break;
            }
        }

        System.out.println("Quantidade de pacientes:" + qtdePacientes);


        System.out.println("Encerrando o cadastro");
        System.exit(0);
    }
}
