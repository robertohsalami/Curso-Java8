package aula2.lambdas;

import java.util.ArrayList;
import java.util.List;

public class OrdenarStringsLambda {

	public static void main(String[] args) {
		List<String> palavras = new ArrayList<>();
		palavras.add("alura online");
		palavras.add("casa do codigo");
		palavras.add("caelum");

		palavras.sort((s1, s2) -> Integer.compare(s1.length(), s2.length()));

		System.out.println(palavras);

		palavras.forEach(s -> System.out.println(s));

	}

}
