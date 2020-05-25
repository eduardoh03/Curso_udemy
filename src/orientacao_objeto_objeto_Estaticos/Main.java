package orientacao_objeto_objeto_Estaticos;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Qual o preço do dolar?");
		double dollarpreco=sc.nextDouble();
		
		System.out.println("Quantos dolares vc quer comprar?");
		double dollar=sc.nextDouble();
		
		double result = ConverterMoeda.dollarreal(dollarpreco,dollar);
		System.out.printf("O preço total é : %.2f",result);
		
		sc.close();
	}

}
