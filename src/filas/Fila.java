package filas;

import estrutura.EstruturaDados;

public class Fila<T> extends EstruturaDados<T>{
	
	public Fila() {
		super();
	}
	
	public Fila(int capacidade) {
		super(capacidade);
	}
	
	public void enfileirar(T elemento) {
		super.adicionar(elemento);
	}
	
	public void desenfileirar() {
		for(int i = 0; i < elementos.length - 1; i++) {
			elementos[i] = elementos[i + 1];
		}
		tamanho--;
	}
	
	public T espiar() {
		if(this.estaVazia()) {
			return null;
		}
		
		return this.elementos[0];
	}
}
