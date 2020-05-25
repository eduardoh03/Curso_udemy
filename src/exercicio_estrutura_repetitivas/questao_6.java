package exercicio_estrutura_repetitivas;

import java.util.Locale;
import java.util.Scanner;

public class questao_6 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);	
		int N = sc.nextInt();
		Double media;
		
		for (int i = 0;i < N; i++) {

			double a = sc.nextDouble();
			double b = sc.nextDouble();
			double c = sc.nextDouble();
			media = (a*2.0 + b * 3.0 + c * 5.0)/10;			
			System.out.printf("%.1f%n",media);	
			}	
		sc.close();
	}

}
