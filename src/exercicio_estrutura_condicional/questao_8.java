package exercicio_estrutura_condicional;

import java.util.Scanner;
import java.util.Locale;

public class questao_8 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		Double s = sc.nextDouble();
		double imposto;
		if (s < 2000.00) {
			imposto = 0;
		} else if (s <= 3000.00) {
			imposto = (s - 2000) * 0.08;
		} else if (s <= 4500.00) {
			imposto = (s - 3000.0) * 0.18 + 1000.0 * 0.08;
		} else {
			imposto = (s - 4500.0) * 0.28 + 1500.0 * 0.18 + 1000.0 * 0.08;
		}
		if (imposto == 0.0) {
			System.out.println("Isento");
		} else {
			System.out.printf("R$ %.2f%n", imposto);
		}
		sc.close();
	}

}
