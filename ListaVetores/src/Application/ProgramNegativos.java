package Application;

import java.util.Scanner;

public class ProgramNegativos {

	public static void main(String[] args) {
		int numero;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Quantos numeros voce vai digitar? ");
		numero = sc.nextInt();
		
		int[] vect = new int[numero];
		
		for (int i=0; i<vect.length; i++) {
			System.out.print("Digite um numero: ");
			vect[i] = sc.nextInt();
		}
		
		System.out.println("NUMEROS NEGATIVOS: ");
		for (int i=0; i<vect.length; i++) {
			if (vect[i]<0)
			System.out.println(vect[i]);		
		}

	}

}
