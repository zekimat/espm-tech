import java.util.Scanner;

public class Exercicio02 {
	public static void main(String[] args) {

		String nome_paciente, genero_paciente;
		double altura_paciente, peso_ideal;

		Scanner sentinela = new Scanner(System.in);

		System.out.print("Insira o seu nome: ");
		nome_paciente = sentinela.nextLine();
		System.out.println("Qual é a sua altura?");
		altura_paciente = sentinela.nextDouble();
		System.out.println("Qual é o seu gênero? 'Masculino' ou 'Feminino'?");
		genero_paciente = sentinela.next();

		if (genero_paciente.equalsIgnoreCase("Masculino")) {
			peso_ideal = 72.7 * altura_paciente - 58;
		} else {
			peso_ideal = 62.1 * altura_paciente - 44.7;
		}

		System.out.printf("Paciente: %s\nGênero: %s\nAltura: %.2fm²\nPeso Ideal: %.2f Kg", nome_paciente,
				genero_paciente, altura_paciente, peso_ideal);

		sentinela.close();
	}
}
