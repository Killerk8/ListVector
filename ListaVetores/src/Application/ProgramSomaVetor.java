package Application;

import java.util.Scanner;

public class ProgramSomaVetor {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n;
		double media=0,soma=0;
		
		System.out.println("Quantos numeros voce vai digitar? ");
		n = sc.nextInt();
		
		double[] vet = new double[n];
		
		for (int i=0; i<vet.length; i++) {
			System.out.print("Digite um numero: ");
			vet[i] = sc.nextInt();
		}
		
		System.out.print("VALORES = ");
		for (int i=0; i<vet.length; i++) {
			System.out.print(vet[i] + " ");
			soma += vet[i];
			media += vet[i];
		}
	
		System.out.println();	
		System.out.print("SOMA = " + soma);
		System.out.println();	
		System.out.println("MEDIA = " + media/n);
		
		
	}

}
