import java.util.Scanner;

public class Exercicio03 {
	public static void main(String[] args) {
		double a, b, c, x1, x2, delta;

		Scanner sentinela = new Scanner(System.in);

		System.out.print("Insira o valor de 'a': ");
		a = sentinela.nextDouble();
		System.out.print("Insira o valor de 'b': ");
		b = sentinela.nextDouble();
		System.out.print("Insira o valor de 'c': ");
		c = sentinela.nextDouble();

		delta = Math.pow(b, 2) - 4 * a * c;

		if (delta >= 0) {
			if (delta == 0) {
				System.out.print("O resultado de 2*a não pode ser zero!");
			} else {
				x1 = (-b + Math.sqrt(delta)) / (2 * a);
				x2 = (-b - Math.sqrt(delta)) / (2 * a);
				System.out.printf("As raízes são:\nx1 = %.2f\nx2 = %.2f", x1, x2);
			}
		} else {
			System.out.print("X não pertence ao conjunto dos números Reais");
		}

		sentinela.close();

	}
}
