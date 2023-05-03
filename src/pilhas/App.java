package pilhas;

public class App {

	public static void main(String[] args) {
		
		Pilha<Integer> pilha = new Pilha<>();
		Pilha<Integer> pilhaPar = new Pilha<>();
		Pilha<Integer> pilhaImpar = new Pilha<>();
		
		for(int i = 0; i < 10; i++) {
			if(i % 2 == 0) {
				pilhaPar.empilhar(i);
			} else {
				pilhaImpar.empilhar(i);
			}
		}
		
		System.out.println(pilhaPar);
		System.out.println(pilhaImpar);
		System.out.println("testando a poltrona");
	}

}
