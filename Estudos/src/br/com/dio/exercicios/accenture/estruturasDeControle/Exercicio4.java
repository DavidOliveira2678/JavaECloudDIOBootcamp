package br.com.dio.exercicios.accenture.estruturasDeControle;
import java.util.Scanner;

//OS ENUNCIADOS DOS EXERCÍCIOS REALIZADOS ESTÃO DISPONÍVES EM:
//https://github.com/digitalinnovationone/exercicios-java-basico

public class Exercicio4 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Informe um número: ");
		int initialNumber = scan.nextInt();
		scan.nextLine();
		
		System.out.print("Agora, informe outro número: ");
		int newNumber = scan.nextInt();
		scan.nextLine();
		
		int result = newNumber % initialNumber;
		
		while (result == 0) {
			System.out.printf("A divisão de %s por %s tem resto 0 [resto: %s]. Por isso, programa segue.\n", newNumber, initialNumber, result);
			System.out.print("\nInforme outro número novamente: ");
			int informedNumber = scan.nextInt();
			scan.nextLine();
			if(informedNumber < initialNumber) {
				System.out.println("Valor inválido!! Os números não podem ser menores que o valor inical.\n");
			} else {
				newNumber = informedNumber;
			}
			
			result = newNumber % initialNumber;
		}
		
		scan.close();
		System.out.println("\n========================================================\n");
		System.out.printf("A divisão de %s por %s tem resto diferente de 0 [resto: %s]. Por isso, programa se encerra.\n", newNumber, initialNumber, result);
		System.out.println("\n[FIM DA EXECUÇÃO]");
		
	}
}
