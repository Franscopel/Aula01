import java.util.Scanner;

public class Calculadora {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		double valor1;
		double valor2;
		double soma, subtracao, multiplicacao, divisao; 
		System.out.println("Por favor digite um valor ");
		valor1 = leitor.nextDouble();
		System.out.println("Por favor digite um segundo valor ");
		valor2 = leitor.nextDouble();
		soma = valor1 + valor2;
		subtracao = valor1 - valor2;
		multiplicacao = valor1 * valor2;
		divisao = valor1 / valor2;
		System.out.println("A soma dos dois valores ? " + soma);
		System.out.println("A diferen?a dos dois valores ? " + subtracao);
		System.out.println("A multiplica??o dos dois valores ? " + multiplicacao);
		System.out.println("A divis?o dos dois valores ? " + divisao);
		leitor.close();
	}

}
