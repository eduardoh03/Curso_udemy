package exercicio_estrutura_condicional;

import java.util.Scanner;

public class questao_2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x;
		x=sc.nextInt();
		if(x%2 == 0) {
			System.out.println("PAR");
		}
		else {
			System.out.println("IMPAR");
		}
		sc.close();
	}

}
