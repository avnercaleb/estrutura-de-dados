package listaEncadeada;

public class App {

	public static void main(String[] args) {
		
		ListaEncadeada<Integer> lista = new ListaEncadeada<>();
		lista.adicionar(1);
		lista.adicionar(2);
		lista.adicionar(3);
		lista.adicionar(4);
		lista.adicionar(5);
		lista.adicionar(6);
		
		System.out.println(lista);
		
		lista.limpar();
		
		System.out.println(lista);
	}

}
