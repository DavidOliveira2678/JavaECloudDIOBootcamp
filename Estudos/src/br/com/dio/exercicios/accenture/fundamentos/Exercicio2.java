package br.com.dio.exercicios.accenture.fundamentos;
import java.util.Scanner;

// ESCREVA UM CÓDIGO QUE RECEBA O TAMANHO DO LADO DE UM QUADRADO,
// CALCULE SUA ÁREA E EXIBA NA TELA. || FÓRMULA: AREA = LADO x LADO.

public class Exercicio2 {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Por favor, informe o lado do quadrado: ");
		double lado = scan.nextDouble();
		scan.nextLine();
		double area = lado * lado;
		
		System.out.println("========================================");
		System.out.printf("\nA área de um quadrado com lados iguais a %s é %s.\n", lado, area);
		System.out.println("\n========================================");
		scan.close();
		
	}
}
