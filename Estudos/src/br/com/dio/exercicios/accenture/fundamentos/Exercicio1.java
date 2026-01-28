package br.com.dio.exercicios.accenture.fundamentos;
import java.time.OffsetDateTime;
import java.util.Scanner;

// ESCREVA UM CÓDIGO QUE RECEBA O NOME E O ANO DE NASCIMENTO DE ALGUÉM
// E IMPRIMA NA TELA A SEGUINTE MENSAGEM: "OLÁ, FULANO, VOCÊ TEM X ANOS."

public class Exercicio1 {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int anoAtual = OffsetDateTime.now().getYear();
		System.out.print("Por favor, escreva o seu nome: ");
		String nome = scan.nextLine();
		System.out.print("Agora, por favor, informe o ano de seu nascimento: ");
		int anoNascimento = scan.nextInt();
		scan.nextLine();
		int idade = anoAtual - anoNascimento;
		
		System.out.println("\n=================== MENSAGEM =====================");
		System.out.printf("\nOlá, %s, você tem %s anos.\n", nome, idade);
		System.out.println("\n==================================================");
		scan.close();
		
	}
}