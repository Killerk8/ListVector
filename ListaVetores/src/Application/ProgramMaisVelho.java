package Application;

import java.util.Scanner;

import entities.Pessoa;

public class ProgramMaisVelho {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int numero,idade,maiorIdade=0,aux=0;
		String nome;
		
		System.out.print("Quantas pessoas serao digitadas? ");
		numero = sc.nextInt();
		
		Pessoa[] vect = new Pessoa[numero];
		
		for (int i=0; i<numero; i++) {
			System.out.println("Dados da " + (i+1) + "a pessoa:");
			
			System.out.print("Nome: ");
			nome = sc.next();
			
			System.out.println("Idade: ");
			idade = sc.nextInt();
			
			vect[i] = new Pessoa(nome,idade);
			
			if (vect[i].getIdade()>maiorIdade) {
				maiorIdade = vect[i].getIdade();
				aux = i;
			}
		}
		
		System.out.println("PESSOA MAIS VELHA: " + vect[aux].getNome());
	}
	
}
