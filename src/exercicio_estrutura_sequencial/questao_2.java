package exercicio_estrutura_sequencial;
import java.util.Scanner;
import java.util.Locale;
public class questao_2 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		float pi,area,r;
		r = sc.nextFloat();
		pi =  (float) 3.14159;
		area = (float) (pi * Math.pow(r, r));
		System.out.printf("A = %.4f",area);
		sc.close();
	}

}
