package exercicio_estrutura_condicional;

import java.util.Scanner;

public class questao_1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x;
		x=sc.nextInt();
		if (x<0) {
			System.out.println("NEGATIVO");
		}
		else {
		System.out.println("POSITIVO");
		}
		sc.close();
	}

}
