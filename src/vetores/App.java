package vetores;

public class App {

	public static void main(String[] args) {
		
		Lista<String> lista = new Lista<>(5);
		lista.adicionar("avner");
		lista.adicionar("caleb");
		
		System.out.println(lista);
	}
}
