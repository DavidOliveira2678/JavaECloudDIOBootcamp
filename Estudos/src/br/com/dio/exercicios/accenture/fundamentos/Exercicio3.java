package br.com.dio.exercicios.accenture.fundamentos;
import java.util.Scanner;

//ESCREVA UM CÓDIGO QUE RECEBA A BASE E A ALTURA DE UM TRIÂNGULO,
//CALCULE SUA ÁREA E EXIBA NA TELA. || FÓRMULA: AREA = BASE x ALTURA.

public class Exercicio3 {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Por favor, informe a base do triângulo: ");
		double base = scan.nextInt();
		scan.nextLine();
		System.out.print("Agora, por favor, informe a altura do triângulo: ");
		double altura = scan.nextInt();
		scan.nextLine();
		double area = base * altura;
		System.out.println("========================================");
		System.out.printf("\nA área de um triângulo com base %s e altura %s é igual a %s.\n", base, altura, area);
		System.out.println("\n========================================");
		scan.close();
	}
}
