package br.com.dio.exercicios.accenture.estruturasDeControle;
import java.util.Scanner;

//OS ENUNCIADOS DOS EXERCÍCIOS REALIZADOS ESTÃO DISPONÍVES EM:
//https://github.com/digitalinnovationone/exercicios-java-basico

public class Exercicio3 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		boolean programa = true;
		
		do {
			System.out.print("Informe um número: ");
			int num1 = scan.nextInt();
			scan.nextLine();
			
			System.out.print("Informe um número maior que o anterior: ");
			int num2 = scan.nextInt();
			scan.nextLine();
	
			System.out.print("Você escolhe par [TRUE] ou ímpar [FALSE]? Digite: ");
			boolean escolha = scan.nextBoolean();
			scan.nextLine();
			
			if(escolha) {
				System.out.printf("\n============ [IMPRIMINDO OS NÚMEROS PARES ENTRE %s e %s, EM ORDEM DECRESCENTE] ============\n", num1, num2);
				for(int i = num2; i >= num1; i--) {
					if(i % 2 == 0 || (i == num1 || i == num2))System.out.println(i);
				}
			} else {
				System.out.printf("\n============ [IMPRIMINDO OS NÚMEROS ÍMPARES ENTRE %s e %s, EM ORDEM DECRESCENTE] ============\n", num1, num2);
				for(int i = num2; i >= num1; i--) {
					if(i % 2 != 0 || (i == num1 || i == num2)) System.out.println(i);
				}
			}
			
			System.out.println("\nVocê deseja continuar com a execução do programa?\nDigite 's' para sim e qualquer coisa para não.");
			System.out.print("Escolha: ");
			String decisao = scan.next();
			if(!decisao.equalsIgnoreCase("s")) programa = false;
			scan.nextLine();
			
		} while(programa);
		
		scan.close();
		System.out.println("\n\n[FIM DA EXECUÇÃO]");
		
	}
}
