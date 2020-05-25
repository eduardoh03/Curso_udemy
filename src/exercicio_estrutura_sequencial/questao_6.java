package exercicio_estrutura_sequencial;
import java.util.Scanner;
import java.util.Locale;
public class questao_6 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Double A,B,C,pi,areat,areac,areatr,areaq,arear;
		pi = 3.14159;
		A=sc.nextDouble();
		B=sc.nextDouble();
		C=sc.nextDouble();
		//area triangle
		areat = (A * C) / 2;
		System.out.printf("TRIANGULO: %.3f%n",areat);
		//area circle
		areac = pi * (C * C);
		System.out.printf("CIRCULO: %.3f%n",areac);
		//area trapesio
		areatr = (C * (A+B)) / 2;
		System.out.printf("TRAPEZIO: %.3f%n",areatr);
		//area quadrado
		areaq = B*B;
		System.out.printf("QUADRADO: %.3f%n",areaq);
		//area retangulo
		arear = A * B;
		System.out.printf("QUADRADO: %.3f%n",arear);
		sc.close();

	}

}
