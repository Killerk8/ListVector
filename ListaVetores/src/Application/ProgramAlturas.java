package Application;

import java.util.Scanner;

import entities.Pessoa;

public class ProgramAlturas {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int numero,idade;
		String nome;
		double altura,media=0,percent=0;	
		
		System.out.print("Quantas pessoas serao digitadas? ");
		numero = sc.nextInt();
		
		Pessoa[] vect = new Pessoa[numero];
		
		for (int i=0; i<numero; i++) {
			System.out.println("Dados da " + (i+1) + "a pessoa:");
			
			System.out.print("Nome: ");
			nome = sc.next();
			
			System.out.println("Idade: ");
			idade = sc.nextInt();
			
			if (idade < 16)
				percent++;
			
			System.out.println("Altura: ");
			altura = sc.nextDouble();
			
			vect[i] = new Pessoa(nome,idade,altura);
			media += altura;
		}
		
		media = media/numero;
		percent = (percent/numero) * 100;
		
		System.out.printf("Altura media: %.2f%n", media);
		System.out.println("Pessoas com menos de 16 anos: "+ percent + "%");
		
		
		for (int i=0; i<vect.length; i++) {
			if (vect[i].getIdade() < 16)
			System.out.println(vect[i].getNome());
		}

	}

}
