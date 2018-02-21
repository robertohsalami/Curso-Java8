import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;

public class OrdenaStrings {

	public static void main(String[] args) {
		//lista de strings e trabalhar com ele sem nenhum dos novos recursos da linguagem
		List<String> palavras = new ArrayList<>();
		palavras.add("alura online");
		palavras.add("casa do codigo");
		palavras.add("caelum");
		Collections.sort(palavras);
		System.out.println(palavras);		
		Comparator<String> comparador = new ComparadorDeStringPorTamanho();
		Collections.sort(palavras, comparador);
		System.out.println(palavras);
		
		//com o java8 esse metodo sort nao existia
		// Em vez de usar o Collections.sort, podemos invocar essa operação na própria List
		palavras.sort(comparador);
		System.out.println(palavras);
		
		Consumer<String> consumidor = new ConsumidorDeString();
		palavras.forEach(consumidor);		
	}

}
