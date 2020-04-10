import java.util.Scanner;

public class Atividade_Dupla_ex3 {

	public static void main(String[] args) {

		int cont_cor, d1, d2, d3, passo;

		Scanner sentinela = new Scanner(System.in);

		System.out.println("Insira o número de sua conta corrente:");
		cont_cor = sentinela.nextInt();

		d1 = cont_cor / 100;
		d2 = cont_cor / 10 % 10;
		d3 = cont_cor % 10;

		passo = cont_cor + (d3 * 100 + d2 * 10 + d1);

		d1 = passo / 100;
		d2 = passo / 10 % 10;
		d3 = passo % 10;

		passo = d1 * 1 + d2 * 2 + d3 * 3;

		cont_cor = passo % 10;

		System.out.print("Seu dígito verificador é: " + cont_cor);

		sentinela.close();

	}
}
