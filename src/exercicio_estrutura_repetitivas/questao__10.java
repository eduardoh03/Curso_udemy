package exercicio_estrutura_repetitivas;

import java.util.Scanner;

public class questao__10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();

		for(int i=1;i<=N;i++) {
			int primeiro = i;
			int segundo = i * i;
			int terceiro = i * i * i;
			System.out.printf("%d %d %d%n",primeiro,segundo,terceiro);
		}
		sc.close();
	}

}