package Application;

import java.util.Scanner;

public class ProgramMaiorPosicao {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int qntdNumeros,posicaoMaior=0;
		double maiorValor=0;
		
		System.out.print("Quantos numeros voce vai digitar? ");
		qntdNumeros = sc.nextInt();

		double[] vet = new double[qntdNumeros];
		
		for (int i=0; i<vet.length; i++) {
			System.out.print("Digite um numero: ");
			vet[i] = sc.nextDouble();			
		}
		
		for (int i=0; i<vet.length; i++) {
			if (vet[i]>maiorValor) {
				maiorValor = vet[i];
				posicaoMaior = i;
			}		
		}
		System.out.println("MAIOR VALOR = " + maiorValor);
		System.out.println("POSICAO DO MAIOR VALOR = " + posicaoMaior);
	}

}
