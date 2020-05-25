package exercicio_estrutura_repetitivas;

import java.util.Locale;
import java.util.Scanner;

public class questao_2{

			public static void main(String[] args) {
				Locale.setDefault(Locale.US);
				Scanner sc = new Scanner(System.in);
				
				Double x=sc.nextDouble();
				Double y=sc.nextDouble();
				while(x !=0 || y!=0) {
				if (x > 0 && y > 0) {
					System.out.println("primeiro");					
				}
				else if (x > 0 && y < 0) {
					System.out.println("quarto");
				}
				else if (x < 0 && y > 0) {
					System.out.println("segundo");					
				}
				else if (x < 0 && y < 0) {
					System.out.println("terceiro");
				}
				x=sc.nextDouble();
				y=sc.nextDouble();
			}
				System.out.println("");
				sc.close();
			}
}

