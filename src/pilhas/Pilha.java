package pilhas;

import estrutura.EstruturaDados;

public class Pilha<T> extends EstruturaDados<T>{
	
	public Pilha() {
		super();
	}
	
	public Pilha(int capacidade) {
		super(capacidade);
	}
	
	public void empilhar(T elemento) {
		super.adicionar(elemento);
	}
	
	public T espiar() {
		if(this.estaVazia()) {
			return null;
		}
		
		return this.elementos[tamanho - 1];
	}
	
	public T desimpilhar() {
		
		if(this.estaVazia()) {
			return null;
		}
		
		return this.elementos[--tamanho];
	}
}
