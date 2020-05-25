package funcoes;

public class Funções_string {

	public static void main(String[] args) {
		String original = "abcde FGHIJ ABC abc DEFG       ";
		//minusculo
		String s01 = original.toLowerCase();
		//maiusculo
		String s02 = original.toUpperCase();
		//sem espaço
		String s03 = original.trim();
		//reescreve a string apartir do ponto
		String s04 = original.substring(2);
		//reescreve a string apartir do ponto até outro ponto
		String s05 = original.substring(2,9);
		//trocar strings
		String s06 = original.replace("abc", "xy");
		//primeira ocorrencia
		int i = original.indexOf("bc");
		//ultima ocorrencia
		int j = original.lastIndexOf("bc");
		//separador
		String s = "potato apple lemon";
		String[] vect = s.split(" ");
		String word1 = vect[0];
		String word2 = vect[1];
		String word3 = vect[2];
		
		System.out.println(word1);
		System.out.println(word2);
		System.out.println(word3);
		System.out.println("- original: "+original+"-");
		System.out.println("+ toLowerCase: "+s01+"+");
		System.out.println("+ toUpperCase: "+s02+"+");
		System.out.println("+ trim: "+s03+"+");
		System.out.println("+ substring(2): "+s04+"+");
		System.out.println("+ substring(2,9): "+s05+"+");
		System.out.println("+ replace(abc)(xy): "+s06+"+");
		System.out.println("+ indexOf 'bc' : "+i);
		System.out.println("+ lastIndexOf 'bc': "+j);
	}

}
