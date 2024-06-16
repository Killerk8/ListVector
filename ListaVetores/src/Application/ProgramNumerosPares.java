package Application;

import java.util.Scanner;

public class ProgramNumerosPares {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int qntdNumeros,numerosPares=0;
		
		System.out.print("Quantos numeros voce vai digitar? ");
		qntdNumeros = sc.nextInt();
		
		int[] vet = new int[qntdNumeros];
		
		for (int i=0; i<vet.length; i++) {
			System.out.print("Digite um numero: ");
			vet[i] = sc.nextInt();
			
		}
		
		System.out.println();
		System.out.println("NUMEROS PARES:");
		for (int i=0; i<vet.length; i++) {
			if (vet[i] % 2 == 0) { 		
				System.out.print(vet[i] + " ");	
				numerosPares++;
			}	
		}
		
		System.out.println();
		System.out.println("QUANTIDADE DE PARES = " + numerosPares);
	}

}
