package br.uniesp.poo.lista01.Q8;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    static Paciente paciente;
    
    public static void insertPaciente () {
    	
    	int qtdePacientes = 0;
    	int idadeHomens = 0;
    	int qtdeHomnens = 0;
    	int qtdeMulheresAltura = 0;
    	int mulheresPeso = 0;
    	int qtdePessoasIdade = 0;
    	String nomePacienteMaisVelho = null;
    	String nomeMulherMaisBaixa = null;
    	int idade = 0;
    	int menorAltura = 0;
    	int alturaAtual = 0;
        ArrayList<Paciente> pacientesList = new ArrayList<Paciente>();
    	Scanner leitor = new Scanner(System.in);
	    String opcao = "S";
	    int i = 1;
    	while (opcao.equals("S") || opcao.equals("s")) {
	    	paciente = new Paciente();
    		
    		System.out.println("Digite o nome do paciente..: ");
    	    paciente.nome = leitor.next();
    		System.out.println("Digite o sexo do paciente..: ");
    	    paciente.sexo = leitor.next();    	    
    		System.out.println("Digite a idade do paciente..: ");
    	    paciente.idade = leitor.nextInt();
    		System.out.println("Digite a altura do paciente..: ");
    	    paciente.altura = leitor.nextInt(); 	    
    		System.out.println("Digite o peso do paciente..: ");
    	    paciente.peso = leitor.nextInt();    	
			pacientesList.add(paciente);

    		System.out.println("Deseja continuar o cadastro S/N..: ");
    		opcao = leitor.next();
    		if (opcao.equals("N") || opcao.equals("n"))  {
    			break;
    		}
    	    
    	}
    	
    	menorAltura = pacientesList.get(0).getAltura();
    	for (int j = 0; j < pacientesList.size() ; j++) {
    	    if ( pacientesList.get(j).getSexo().equals("M") || pacientesList.get(j).getSexo().equals("m") ) {
        	    idadeHomens = idadeHomens + pacientesList.get(j).getIdade();
        	    qtdeHomnens++;
    	    } else {
    	    	
    	    }
    	    if ( pacientesList.get(j).getSexo().equals("F") || pacientesList.get(j).getSexo().equals("f") ) {
    	    	if (pacientesList.get(j).getAltura() >= 160 && pacientesList.get(j).getAltura() <=170 && pacientesList.get(j).getPeso() > 70) {
    	    		qtdeMulheresAltura ++;		
    	    	}				
    	    	
    	    	if (pacientesList.get(j).getAltura() < menorAltura) {
    	    	    nomeMulherMaisBaixa = pacientesList.get(j).getNome();
    	    	}
    	    }
    	        	    
    	    if (pacientesList.get(j).getIdade() >= 18 && pacientesList.get(j).getIdade() <= 25 ) {
    	    	qtdePessoasIdade++;
    	    }
    	    
    	    if (pacientesList.get(j).getIdade() > idade) {
    	    	nomePacienteMaisVelho = pacientesList.get(j).getNome();
    	    	idade = pacientesList.get(j).getIdade();
    	    }
    	    
    	} 
    	
		System.out.println("Quantidade de pacientes..: "+ pacientesList.size());  
		
		System.out.println("Média idade dos homens..: "+ idadeHomens / qtdeHomnens);  

		System.out.println("Quantidade de mulheres altura entre 1,60 e 1,70 e peso maior 70..: "+ qtdeMulheresAltura);  

		System.out.println("Quantidade de pessoas com idade entre 18 e 25 anos..: "+ qtdePessoasIdade); 
		
		System.out.println("Nome do paciente mais Velho..: "+ nomePacienteMaisVelho);  

		System.out.println("Nome da mulher mais baixa..: "+ nomeMulherMaisBaixa);  

		System.out.println("Programa encerrado com sucesso!");
	    System.exit(0);
    }

	
    public static void main(String[] argv) {

        insertPaciente();

      }
    
    public static class Paciente {
        private String nome;
        private String sexo;
        private Integer idade;
        private Integer altura;
        private Integer peso;
		public String getNome() {
			return nome;
		}
		public void setNome(String nome) {
			this.nome = nome;
		}
		public String getSexo() {
			return sexo;
		}
		public void setSexo(String sexo) {
			this.sexo = sexo;
		}
		public Integer getIdade() {
			return idade;
		}
		public void setIdade(Integer idade) {
			this.idade = idade;
		}
		public Integer getAltura() {
			return altura;
		}
		public void setAltura(Integer altura) {
			this.altura = altura;
		}
		public Integer getPeso() {
			return peso;
		}
		public void setPeso(Integer peso) {
			this.peso = peso;
		}
        
    }

	
	
}
