package application;

import java.util.Scanner;

import entities.Texto;

public class Program {
	public static void main(String[] args) {
		Texto texto = new Texto();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o texto:");
		texto.texto = sc.nextLine();
		System.out.println(texto);
		
		sc.close();
	}
}
