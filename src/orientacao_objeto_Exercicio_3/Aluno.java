package orientacao_objeto_Exercicio_3;

public class Aluno {
	public String nome;
	public double nota1;
	public double nota2;
	public double nota3;

	public double nota_final() {
		return nota1 + nota2 + nota3;
	}

	public String toString() {
		if (nota_final() >= 60) {
			return "FINAL GRADE = " + String.format("%.2f%n", nota_final()) + "PASS";
		} else {

			return "FINAL GRADE = "

					+ String.format("%.2f%n", nota_final())

					+ "FAILED%n"

					+ "Missing "

					+ String.format("%.2f", 60.0 - nota_final())

					+ " POINTS";

		}
	}
}
