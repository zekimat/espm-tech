import java.util.Scanner;
public class Atividade_Dupla_ex1 {
	public static void main(String[] args) {

		double xA, yA, xB, yB, xC, yC, a, b, c, area, p;

		Scanner sentinela = new Scanner(System.in);

		System.out.print("Insira o valor de 'xA': ");
		xA = sentinela.nextDouble();
		System.out.print("Insira o valor de 'yA': ");
		yA = sentinela.nextDouble();
		System.out.print("Insira o valor de 'xB': ");
		xB = sentinela.nextDouble();
		System.out.print("Insira o valor de 'yB': ");
		yB = sentinela.nextDouble();
		System.out.print("Insira o valor de 'xC': ");
		xC = sentinela.nextDouble();
		System.out.print("Insira o valor de 'yC': ");
		yC = sentinela.nextDouble();

		a = Math.sqrt(Math.pow(xB - xC, 2) + Math.pow(yB - yC, 2));
		b = Math.sqrt(Math.pow(xA - xC, 2) + Math.pow(yA - yC, 2));
		c = Math.sqrt(Math.pow(xA - xB, 2) + Math.pow(yA - yB, 2));

		p = (a + b + c) / 2;
		area = Math.sqrt(p * (p - a) * (p - b) * (p - c));

		System.out.printf("Área = %.2f", area);

		sentinela.close();
	}
}
