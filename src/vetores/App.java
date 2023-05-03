package vetores;

public class App {

	public static void main(String[] args) {
		
				
		Lista<String> lista = new Lista<String>(5);
		lista.adicionar("avner");
		lista.adicionar("caleb");
		lista.adicionar("camila");
		lista.adicionar("avner");
		lista.adicionar("caleb");
		lista.adicionar("camila");
		
		System.out.println(lista);
		
		lista.limparLista();
		System.out.println(lista);
	}
}
