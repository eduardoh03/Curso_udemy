package exercicio_estrutura_condicional;
import java.util.Locale;
import java.util.Scanner;

public class questao_6 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Double a;
		a=sc.nextDouble();
		if (a > 0 && a <= 25) {
			System.out.println("intervalo [0,25] ");
		}
		else if (a > 25 && a <= 50) {
			System.out.println("Intervalo [25,50] ");
		}
		else if (a > 50 && a <= 75) {
			System.out.println("Intervalo [50,75]");
		}
		else if (a > 75 && a < 100) {
			System.out.println("Intervalo [ 75,100]");
		}
		sc.close();
	}

}
