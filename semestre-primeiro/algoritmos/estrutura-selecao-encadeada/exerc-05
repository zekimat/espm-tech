import java.util.Scanner;

public class Exercicio05 {
	public static void main(String[] args) {

		int a, b, c;

		Scanner sentinela = new Scanner(System.in);

		System.out.println("Insira três valores inteiros distintos entre si!");

		System.out.print("Insira o valor de 'a': ");
		a = sentinela.nextInt();
		System.out.print("Insira o valor de 'b': ");
		b = sentinela.nextInt();
		System.out.print("Insira o valor de 'c': ");
		c = sentinela.nextInt();

		if (a < b && a < c) {
			if (b < c) {
				System.out.printf("\nEm ordem crescente, os números são: a= %d < b= %d < c= %d", a, b, c);
			} else {
				System.out.printf("\nEm ordem crescente, os números são: a= %d < c= %d < b= %d", a, c, b);
			}
		} else if (b < a && b < c) {
			if (a < c) {
				System.out.printf("\nEm ordem crescente, os números são: b= %d < a= %d < c= %d", b, a, c);
			} else {
				System.out.printf("\nEm ordem crescente, os números são: b= %d < c= %d < a= %d", b, c, a);
			}
		} else if (a < b) {
			System.out.printf("\nEm ordem crescente, os números são: c= %d < a= %d < b= %d", c, a, b);
		} else {
			System.out.printf("\nEm ordem crescente, os números são: c= %d < b= %d < a= %d", c, b, a);
		}

		sentinela.close();
	}
}
