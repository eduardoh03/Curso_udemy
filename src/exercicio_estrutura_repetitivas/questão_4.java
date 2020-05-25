package exercicio_estrutura_repetitivas;

import java.util.Scanner;

public class questão_4 {

	public static void main(String[] args) {
		// (1 <= x <= 1000)
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite um valor para X: ");
		int x = sc.nextInt();

		
		if (x > 1 && x < 1000) {
			for (int i = 1; i <= x; i++) {
				if (i % 2 !=0) {
				System.out.println(i);;
				}
			}
		}		
		sc.close();
	}

}
