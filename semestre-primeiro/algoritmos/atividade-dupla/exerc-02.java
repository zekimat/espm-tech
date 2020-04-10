import java.util.Scanner;

public class Atividade_Dupla_ex2 {
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
		
		x1 = (-b + Math.sqrt(delta)) / (2 * a);
		
		x2 = (-b - Math.sqrt(delta)) / (2 * a);

		System.out.printf("x1 = %.2f\n", x1);
		System.out.printf("x2 = %.2f", x2);

		sentinela.close();
		
	}
	
}
