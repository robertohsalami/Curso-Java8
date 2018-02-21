import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;

public class ExercicioAula1 {

	public static void main(String[] args) {
		List<String> palavras = new ArrayList<>();
		palavras.add("alura online");
		palavras.add("casa do codigo");
		palavras.add("caelum");
		
		Consumer<String> consumidor = new ConsumidorDeStrings();
		palavras.forEach(consumidor);
		
		Comparator<String> ordenar = new OrdernarPorTamanhoString();
		palavras.sort(ordenar);
		System.out.println(palavras);
	}	
	
}

class ConsumidorDeStrings implements Consumer<String>{
	@Override
	public void accept(String s) {
		System.out.println(s);			
	}		
}

class OrdernarPorTamanhoString implements Comparator<String>{
	@Override
	public int compare(String s1, String s2) {
		if(s1.length() < s2.length())
			return -1;
		if(s1.length() > s2.length())
			return 1;
		return 0;
	}	
}
