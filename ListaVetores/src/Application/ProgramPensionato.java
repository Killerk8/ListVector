package Application;

import java.util.Scanner;

import entities.Pessoa;

public class ProgramPensionato {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Pessoa[] vet = new Pessoa[10];
		
		System.out.println("Quantos quartos serão alugados? ");
		int n = sc.nextInt();
		
		for (int i=0; i<n; i++) {
			System.out.println();
			System.out.println("Rent #" + i + ":");
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Email: ");
			String email = sc.nextLine();
			System.out.print("Room: ");
			int room = sc.nextInt();
			vet[room] = new Pessoa(name, email);
		}
		
		System.out.println();
		System.out.println("Busy rooms:");
		for (int i=0; i<10; i++) {
		if (vet[i] != null) {
		System.out.println(i + ": " + vet[i]);
		}
		}
	}

}
