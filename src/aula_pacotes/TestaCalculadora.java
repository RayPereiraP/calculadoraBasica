package aula_pacotes;

import java.util.Scanner;
import aula_pacotes.calculo.Calculadora;

public class TestaCalculadora {
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		float num1 = 0, num2 = 0;
		
		System.out.println("Digite por favor o primeiro número: ");
		num1 = leia.nextFloat();
		
		System.out.println("Digite outro número por favor: ");
		num2 = leia.nextFloat();
		
		// Exibe o resultado das operações:
		System.out.println("Soma = " + Calculadora.soma(num1, num2));
		System.out.println("Subtração = " + Calculadora.subtracao(num1, num2));
		System.out.println("Multiplicação = " + Calculadora.multiplicacao(num1, num2));
		System.out.println("Divisão = " + Calculadora.divisao(num1, num2));
		
		// finaliza o Objeto leia
		leia.close();
	}

}
