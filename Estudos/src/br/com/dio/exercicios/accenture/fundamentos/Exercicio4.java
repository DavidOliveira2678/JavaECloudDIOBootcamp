package br.com.dio.exercicios.accenture.fundamentos;
import java.util.Scanner;

//ESCREVA UM CÓDIGO QUE RECEBA O NOME E A IDADE DE DUAS
//PESSOAS E IMPRIMA A DIFERENÇA DE IDADE ENTRE ELAS.

public class Exercicio4 {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Por favor, informe o nome e a idade da 1ª pessoa.");
		System.out.print("NOME  >> ");
		String nomePessoa1 = scan.nextLine();
		System.out.print("IDADE >> ");
		int idadePessoa1 = scan.nextInt();
		scan.nextLine();
		System.out.println("Por favor, informe o nome e a idade da 2ª pessoa.");
		System.out.print("NOME  >> ");
		String nomePessoa2 = scan.nextLine();
		System.out.print("IDADE >> ");
		int idadePessoa2 = scan.nextInt();
		
		int diferencaDeIdades = Integer.max(idadePessoa1, idadePessoa2) - Integer.min(idadePessoa1, idadePessoa2);
		
		System.out.println("========================================");
		System.out.printf("\nNome  da 1ª pessoa: %s\nIdade da 1ª pessoa: %s\n\nNome  da 2ª pessoa: %s\nIdade da 2ª pessoa: %s\n", nomePessoa1, idadePessoa1, nomePessoa2, idadePessoa2);
		System.out.printf("\nDiferença das idades: %s\n", diferencaDeIdades);
		System.out.println("\n========================================");
		scan.close();
	}
}
