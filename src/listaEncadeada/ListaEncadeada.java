package listaEncadeada;

public class ListaEncadeada<T> {
	
	private No<T> inicio;
	private No<T> ultimo;
	private int tamanho;
	
	public void adicionar(T elemento) {
		No<T> celula = new No<T>(elemento);
		if(this.tamanho == 0) {
			this.inicio = celula;
		} else {
			this.ultimo.setProximo(celula);
		}
		this.ultimo = celula;
		this.tamanho++;
	}
	
	public int tamamho() {
		return this.tamanho;
	}
	
	public void limpar() {
		
		for(No<T> atual = this.inicio; atual != null;) {
			No<T> proximo = atual.getProximo();
			atual.setElemento(null);
			atual.setProximo(null);
			atual = proximo;
		}
		
		this.inicio = null;
		this.ultimo = null;
		this.tamanho = 0;
	}

	@Override
	public String toString() {
		if(this.tamanho == 0) {
			return "[]";
		}
		
		StringBuilder builder = new StringBuilder("[");
		No<T> atual = this.inicio;		
		
		for(int i = 0; i < this.tamanho - 1; i++) {
			builder.append(atual.getElemento()).append(", ");
			atual = atual.getProximo();
		}
		
		builder.append(atual.getElemento()).append("]");
		return builder.toString();
	}
}
