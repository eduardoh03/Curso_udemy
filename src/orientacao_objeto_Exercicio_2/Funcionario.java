package orientacao_objeto_Exercicio_2;

public class Funcionario {
	public String nome;
	public double salario_bruto;
	public double imposto;

	public double salario() {
		double s= salario_bruto - imposto;
		return s;
	}

	public double salario_increm(double percentage) {
		return salario_bruto += salario_bruto * percentage /100.0; 
	}
	public String toString() {
		return nome + ", $ " + String.format("%.2f", salario());
		}
}
