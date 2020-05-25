package exercicio_estrutura_repetitivas;

import java.util.Scanner;

public class questao_7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Número de divisões:");
		int N=sc.nextInt();
		double div;
		for(int i = 0;i<N;i++) {
			//numerador
			double a=sc.nextDouble();
			//denominador
			double b =sc.nextDouble();
			if (b==0) {
				System.out.println("divisao impossivel");
			}
			div=a/b;
			System.out.println(div);
		}
		sc.close();
	}

}
