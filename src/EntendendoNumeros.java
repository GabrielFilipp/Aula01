import java.util.Scanner;

public class EntendendoNumeros {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		int valor1;
		int valor2;
		int soma,subtracao,multiplicacao;
		double divisao;
		
		System.out.println("CALCULADORA");
		System.out.println("Por favor, digite um valor");
		valor1 = leitor.nextInt();
		System.out.println("Por favor, digite um segundo valor");
		valor2 = leitor.nextInt();

		soma = valor1 + valor2;
		subtracao = valor1- valor2;
		multiplicacao = valor1 * valor2;
		divisao = (double)valor1/(double)valor2;
		
		System.out.println("O primeiro valor é: " + valor1);
		System.out.println("O segundo valor é: " + valor2);
		System.out.println("O produto da soma é: " + soma);
		System.out.println("O produto da subtracao é: " + subtracao);
		System.out.println("O produto da multiplicacao é: " + multiplicacao);
		System.out.println("O produto da divisao é: " + divisao);
		
		
		leitor.close();
	}

}
