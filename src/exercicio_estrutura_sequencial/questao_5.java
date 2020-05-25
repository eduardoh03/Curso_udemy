package exercicio_estrutura_sequencial;
import java.util.Scanner;
import java.util.Locale;
public class questao_5 {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		int numero,codigo;
		double valorpeca,total1;
		System.out.println("Dados da peça 1 :");
		codigo = sc.nextInt();
		numero = sc.nextInt();
		valorpeca = sc.nextDouble();
		
		total1 = numero * valorpeca;
				
		int numero2,codigo2;
		double valorpeca2,total2;
		System.out.println("Dados da peça 2 :");
		codigo2 = sc.nextInt();
		numero2 = sc.nextInt();
		valorpeca2 = sc.nextDouble();
		
		total2 = numero2 * valorpeca2;
		
		double total3;
		total3=total1 + total2;
		
		System.out.printf("VALOR A PAGAR : %.2f",total3);
		sc.close();
	}


}