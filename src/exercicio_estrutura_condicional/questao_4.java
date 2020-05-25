package exercicio_estrutura_condicional;

import java.util.Scanner;

public class questao_4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int horas_1,horas_2,horasfinal;
		
		System.out.println("Horas de inicio do jogo");
		horas_1=sc.nextInt();
		System.out.println("Horas de termino do jogo");
		horas_2=sc.nextInt();
		
		if(horas_1<horas_2) {
			horasfinal = horas_2 - horas_1;
					System.out.printf("O jogo durou %d hora(s)%n",horasfinal);
		}
		else if(horas_2<horas_1){
			horasfinal =(horas_2 + 24) - horas_1;
			System.out.printf("O jogo durou %d hora(s)%n", horasfinal);
		}
		else if(horas_2==horas_1) {
			horas_2 = horas_2 + 24;
			horasfinal = horas_2 - horas_1;
			System.out.printf("O jogo durou %d hora(s)%n", horasfinal);
		}
		else {
			horasfinal = horas_2 - horas_1;
			System.out.printf("o jogo durou %d hora(s)%n", horasfinal);
		}
		sc.close();
	}
}
