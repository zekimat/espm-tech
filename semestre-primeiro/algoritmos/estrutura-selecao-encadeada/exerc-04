import java.util.Scanner;

public class Exercicio04 {
	public static void main(String[] args) {

		int a, b, c;

		Scanner sentinela = new Scanner(System.in);

		System.out.print("Insira o primeiro valor inteiro 'a': ");
		a = sentinela.nextInt();
		System.out.print("Insira o segundo valor inteiro 'b': ");
		b = sentinela.nextInt();
		System.out.print("Insira o terceiro valor inteiro 'c': ");
		c = sentinela.nextInt();

		if (a != b && a != c) {
			if (b != c) {
				if (a < b && a < c) {
					System.out.printf("\nO menor valor inserido foi a = %d", a);
				} else if (b < c) {
					System.out.printf("\nO menor valor inserido foi b = %d", b);
				} else {
					System.out.printf("\nO menor valor inserido foi c = %d", c);
				}
			} else {
				System.out.print("\nOs números não são diferentes entre si!");
			}
		} else {
			System.out.print("\nOs números não são diferentes entre si!");
		}

		sentinela.close();
	}

}
