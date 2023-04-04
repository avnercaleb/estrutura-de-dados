package vetores;

public class App {

	public static void main(String[] args) {
		
		var vetor = new Vetor(10);
		vetor.adicionar(5);
		vetor.adicionar(10);
		vetor.adicionar(1);
		vetor.adicionar(35);
		vetor.adicionar(15);
		System.out.println(vetor.toString());
	}

}
