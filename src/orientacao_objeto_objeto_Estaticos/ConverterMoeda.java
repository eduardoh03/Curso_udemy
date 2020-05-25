package orientacao_objeto_objeto_Estaticos;

public class ConverterMoeda {

	public static final double IOF = 0.06;

	public static double dollarreal(double dollarpreco, double dollar) {
		return dollar * dollarpreco * (1.0 + IOF);
	}
}
