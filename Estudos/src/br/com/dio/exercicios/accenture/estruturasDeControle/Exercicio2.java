package br.com.dio.exercicios.accenture.estruturasDeControle;
import java.util.Scanner;

//OS ENUNCIADOS DOS EXERCÍCIOS REALIZADOS ESTÃO DISPONÍVES EM:
//https://github.com/digitalinnovationone/exercicios-java-basico

public class Exercicio2 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("============ [BOAS VINDAS À CALCULADORA DE IMC] ============");
		System.out.print("-- Informe sua altura: ");
		double altura = scan.nextDouble();
		scan.nextLine();
		
		System.out.print("-- Informe seu peso: ");
		double peso = scan.nextDouble();
		scan.nextLine();
		
		double imc = peso/(altura * altura);
		
		System.out.println("\n===========================================================");
		if(imc <= 18.5) {
			System.out.printf("Você tem %s de altura e %s de peso.\nO resultado do seu IMC foi %.2f.\n\nLogo, você está abaixo do peso.\n", altura, peso, imc);
		} else if (imc < 25.0) {
			System.out.printf("Você tem %s de altura e %s de peso.\nO resultado do seu IMC foi %.2f.\n\nLogo, você está no peso ideal.\n", altura, peso, imc);
		} else if (imc < 30.0) {
			System.out.printf("Você tem %s de altura e %s de peso.\nO resultado do seu IMC foi %.2f.\n\nLogo, você está levemente acima do peso.\n", altura, peso, imc);
		} else if (imc < 35.0) {
			System.out.printf("Você tem %s de altura e %s de peso.\nO resultado do seu IMC foi %.2f.\n\nLogo, você está com Obesidade de Grau I.\n", altura, peso, imc);
		} else if (imc < 40.0) {
			System.out.printf("Você tem %s de altura e %s de peso.\nO resultado do seu IMC foi %.2f.\n\nLogo, você está com Obesidade de Grau II (Obesidade Servera).\n", altura, peso, imc);
		} else if (imc >= 40.0) {
			System.out.printf("Você tem %s de altura e %s de peso.\nO resultado do seu IMC foi %.2f.\n\nLogo, você está com Obesidade de Grau III (Obesidade Mórbida).\n", altura, peso, imc);
		}
		System.out.println("===========================================================\n");
		
		scan.close();
		System.out.println("[FIM DA EXECUÇÃO]");
	}
}
