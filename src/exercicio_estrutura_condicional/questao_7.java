package exercicio_estrutura_condicional;

import java.util.Locale;
import java.util.Scanner;

public class questao_7 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Double x=sc.nextDouble();
		Double y=sc.nextDouble();
		if (x > 0 && y > 0) {
			System.out.println("Q1");
		}
		else if (x > 0 && y < 0) {
			System.out.println("Q4 ");
		}
		else if (x < 0 && y > 0) {
			System.out.println("Q2");
		}
		else if (x < 0 && y < 0) {
			System.out.println("Q3");
		}
		else if (x ==0 && y == 0) {
			System.out.println("ORIGEM");
		}
		else if (x == 0 ) {
			System.out.println("EIXO X");
		}
		else if (y == 0) {
			System.out.println("EIXO Y");
		}
		
		
		sc.close();
	}

}
