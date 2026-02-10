package br.com.dio.exercicios.accenture.estruturasDeControle;
import java.util.Scanner;

// OS ENUNCIADOS DOS EXERCÍCIOS REALIZADOS ESTÃO DISPONÍVES EM:
// https://github.com/digitalinnovationone/exercicios-java-basico

public class Exercicio1 {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("============ [TABUADA DE X ATÉ 10] ============");
		System.out.print("Informe o valor de X: ");
		int num = scan.nextInt();
		scan.nextLine();
		
		System.out.println("\n===============================================");
		for(int i = 0; i<=10; i++) {
			System.out.printf("%s x %s = %s\n", num, i, (num*i));
		}
		System.out.println("===============================================\n");
		
		scan.close();
		
		System.out.println("[FIM DA EXECUÇÃO]");
	
	}
}