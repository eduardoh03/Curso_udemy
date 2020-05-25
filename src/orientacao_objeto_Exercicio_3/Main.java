package orientacao_objeto_Exercicio_3;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Aluno aln = new Aluno();
		
		System.out.println("Informe o nome do aluno: ");
		aln.nome = sc.nextLine();
		
		System.out.println("Informe as notas: ");
		aln.nota1 = sc.nextDouble();
		aln.nota2 = sc.nextDouble();
		aln.nota3 = sc.nextDouble();
		
		System.out.printf("Aluno:" +aln.toString());
		sc.close();
	}

}
