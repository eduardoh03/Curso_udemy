package orientacao_objeto_Exercicio_2;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Funcionario func = new Funcionario();
		
		System.out.println("Informe o nome do funcionario: ");
		func.nome = sc.nextLine();
		
		System.out.println("Informe o salario do funcionario: ");
		func.salario_bruto = sc.nextDouble();
		
		System.out.println("Informe o imposto: ");
		func.imposto = sc.nextDouble();
		
		System.out.println(func);
		
		System.out.println("Informe a porcentagem de incremento de salario: ");
		double percentage=sc.nextDouble();
		func.salario_increm(percentage);
		
		System.out.println();
		System.out.println("Salario atualizado: " + func);
		
		sc.close();

	}

}
