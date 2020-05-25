package orientacao_objeto_Exercicio_1;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		retangulo ret = new retangulo();
		
		System.out.println("informe a altura e largura : ");
		ret.largura=sc.nextDouble();
		ret.altura=sc.nextDouble();
		
		System.out.printf("AREA = %.2f%n", ret.area());
		System.out.printf("PERIMETRO = %.2f%n", ret.perimetro());
		System.out.printf("DIAGONAL = %.2f", ret.diagonal());
		
		sc.close();
	}

}
