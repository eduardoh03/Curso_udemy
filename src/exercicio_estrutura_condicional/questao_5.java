package exercicio_estrutura_condicional;

import java.util.Scanner;

public class questao_5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("CODIGO | ESPECIFICAÇÃO   | PRECO");
		System.out.println("  1    | Cachorro Quente | R$ 4,00");
		System.out.println("  2    |    X-SALADA     | R$ 4,50");
		System.out.println("  3    |    X-BACON      | R$ 5,00");
		System.out.println("  4    | Torrada Simples | R$ 2,00");
		System.out.println("  5    |  Refrigerenta   | R$ 1,50");
		int x=sc.nextInt();
		int y=sc.nextInt();
		if(x==1) {
			 double total = 4.00 * y;
			System.out.printf("TOTAL: R$ %.2f",total);
		}
		else if (x==2) {
			double total = 4.50 * y;
			System.out.printf("TOTAL: R$ %.2f",total);
		}
		else if (x==3) {
			double total = 5.00 * y;
			System.out.printf("TOTAL: R$ %.2f",total);
		}
		else if (x==4) {
			double total = 2.00 * y;
			System.out.printf("TOTAL: R$ %.2f",total);
		}
		else if (x==5) {
			double total = 1.50 * y;
			System.out.printf("TOTAL: R$ %.2f",total);
		}
		else {
			System.out.println("valor invalido");
		}
		sc.close();
	}

}
