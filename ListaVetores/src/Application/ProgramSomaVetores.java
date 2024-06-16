package Application;

import java.util.Scanner;

public class ProgramSomaVetores {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int qntValores;
		
		System.out.print("Quantos numeros voce vai digitar? ");
		qntValores = sc.nextInt();
		
		
		System.out.println();
		
		int[] vet1 = new int[qntValores];
		int[] vet2 = new int[qntValores];
		
		System.out.println("Digite os valores do Vetor A:");
		
		for (int i=0; i<vet1.length; i++) {
			vet1[i] = sc.nextInt();
		}
		
		System.out.println();
		
		System.out.println("Digite os valores do Vetor B:");
		
		for (int i=0; i<vet2.length; i++) {
			vet2[i] = sc.nextInt();
		}
		
		System.out.println();
		
		System.out.println("VETOR RESULTANTE:");
		
		for (int i=0; i<vet1.length; i++) {
			System.out.println(vet1[i] + vet2[i]);
		}
		
	}

}
