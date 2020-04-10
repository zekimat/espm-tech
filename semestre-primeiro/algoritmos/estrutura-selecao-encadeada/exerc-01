import java.util.Scanner;

public class Exercicio01 {
	public static void main(String[] args) {

		double taxa, valor_conta;
		int num_diaria;

		Scanner sentinela = new Scanner(System.in);

		System.out.print("Favor inserir o número de diárias utilizadas: ");
		num_diaria = sentinela.nextInt();

		if (num_diaria > 15) {
			taxa = 15.5;
		} else if (num_diaria == 15) {
			taxa = 36;
		} else {
			taxa = 58;
		}

		valor_conta = 150 + taxa * num_diaria;

		System.out.printf("O valor de sua conta é: R$%.2f.", valor_conta);

		sentinela.close();
	}
}
