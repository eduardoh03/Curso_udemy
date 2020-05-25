package exercicio_estrutura_repetitivas;

import java.util.Locale;
import java.util.Scanner;

public class questao_3 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		int alcool = 0;
		int gasolina = 0;
		int diesel = 0;

		int x = sc.nextInt();
		while (x <= 0 || x > 4) {
			System.out.println("Dado invalido,informe um novo codigo");
			x = sc.nextInt();
		}
		while (x == 1 || x == 2 || x == 3 || x == 4) {
			if (x == 1) {
				alcool += 1;
				x = sc.nextInt();
				while (x <= 0 || x > 4) {
					System.out.println("Dado invalido,informe um novo codigo");
					x = sc.nextInt();
				}
			} else if (x == 2) {
				gasolina += 1;
				x = sc.nextInt();
				while (x <= 0 || x > 4) {
					System.out.println("Dado invalido,informe um novo codigo");
					x = sc.nextInt();
				}
			} else if (x == 3) {
				diesel += 1;
				x = sc.nextInt();
				while (x <= 0 || x > 4) {
					System.out.println("Dado invalido,informe um novo codigo");
					x = sc.nextInt();
				}
			} else if (x == 4) {
				System.out.println("MUITO OBRIGADO");
				System.out.printf("Alcool: %d%n", alcool);
				System.out.printf("Gasolina: %d%n", gasolina);
				System.out.printf("Diesel: %d%n", diesel);
				break;
			} 
			
		}
		sc.close();
	}
}
