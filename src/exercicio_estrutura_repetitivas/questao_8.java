package exercicio_estrutura_repetitivas;

import java.util.Scanner;

public class questao_8 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int F = sc.nextInt();
		int fat=1;
		
		for(int i=1;i<=F;i++) {
			fat *=  i;
		}		
		System.out.println(fat);
		sc.close();
	}

}
