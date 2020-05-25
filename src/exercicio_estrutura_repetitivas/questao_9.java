package exercicio_estrutura_repetitivas;

import java.util.Scanner;

public class questao_9 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int D = sc.nextInt();

		for (int i = 1; i <= D; i++) {
			if (D%i==0) {
				System.out.println(i);
			}

		}
		sc.close();
	}

}
