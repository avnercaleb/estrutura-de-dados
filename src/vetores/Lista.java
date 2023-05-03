package vetores;

import estrutura.EstruturaDados;

public class Lista<T> extends EstruturaDados<T>{
		
	public Lista() {
		super();
	}
	
	public Lista(int capacidade) {
		super(capacidade);
	}
	
	public boolean adicionar(T novoElemento) {
		return super.adicionar(novoElemento);
	}
	
	protected boolean adicionar(int posicao, T elemento) {
		return super.adicionar(posicao, elemento);
	}
	
	public void excluir(int posicao) {
		if(!(posicao >= 0 && posicao < tamanho)) {
			throw new IllegalArgumentException("A posicao não existe no vetor");
		}
		
		for(int i = posicao; i < this.tamanho - 1; i++) {
			this.elementos[i] = this.elementos[i + 1];
		}
		this.tamanho--;
	}
	
	public void excluir(T elemento) {
		int pos = this.buscarElemento(elemento);
		if(pos > -1) {
			this.excluir(pos);
		}
	}
	
	public void limparLista() {
		for(int i = 0; i < this.tamanho(); i++) {
			this.elementos[i] = null;
		}
		this.tamanho = 0;
	}
	
	public T buscarPosicao(int posicao) {
		if(!(posicao >= 0 && posicao < tamanho)) {
			throw new IllegalArgumentException("A posicao não existe no vetor");
		}		
		return this.elementos[posicao];
	}
	
	public Integer buscarElemento(T elemento) {
		for(int i = 0; i < tamanho; i++) {
			if(this.elementos[i].equals(elemento)) return i;
		}
		return -1;
	}
	
	public Integer ultimoIndice(T elemento) {
		for(int i = this.tamanho -1; i >=0; i--) {
			if(this.elementos[i].equals(elemento)) {
				return i;
			}			
		}
		return -1;
	}
	
}
