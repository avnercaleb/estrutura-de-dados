package vetores;

import java.lang.reflect.Array;

public class Lista<T> {
	
	private T[] elementos;
	private Integer tamanho;
	
	public Lista(Integer capacidade) {
		this.elementos = (T[]) new Object[capacidade];
		this.tamanho = 0;
	}
	
	public Lista(Integer capacidade, Class<T> tipoClasse) {
		this.elementos = (T[]) Array.newInstance(tipoClasse, capacidade);
		this.tamanho = 0;
	}
	
	public boolean adicionar(T novoElemento) {
		this.aumentarCapacidade();
		if(this.tamanho < this.elementos.length) {
			this.elementos[this.tamanho] = novoElemento;
			this.tamanho++;
			return true;
		} else {
			return false;
		}
	}
	
	public void adicionar(int posicao, T elemento) {
		if(!(posicao >= 0 && posicao < tamanho)) {
			throw new IllegalArgumentException("A posicao não existe no vetor");
		}
		
		this.aumentarCapacidade();
		for(int i = tamanho - 1; i >= posicao; i--) {
			this.elementos[i + 1] = this.elementos[i];
		}
		this.elementos[posicao] = elemento;
		this.tamanho++;
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
	
	public String buscarPosicao(int posicao) {
		if(!(posicao >= 0 && posicao < tamanho)) {
			throw new IllegalArgumentException("A posicao não existe no vetor");
		}		
		return this.elementos[posicao].toString();
	}
	
	public Integer buscarElemento(T elemento) {
		for(int i = 0; i < tamanho; i++) {
			if(this.elementos[i] == elemento) return i;
		}
		return -1;
	}
	
	public int tamanho() {
		return this.tamanho;
	}	
	
	public String toString() {
		StringBuilder s = new StringBuilder();
		s.append("[");
		
		for(int i = 0; i < this.tamanho - 1; i++) {
			s.append(this.elementos[i]);
			s.append(", ");
		}
		
		if(this.tamanho > 0) s.append(this.elementos[this.tamanho - 1]);
		s.append("]");
		
		return s.toString();
	}
	

	private void aumentarCapacidade() {
		if(tamanho == elementos.length) {
			T[] novoVetor = (T[]) new Object[this.elementos.length * 2];
			
			for(int i = 0; i < tamanho; i++) {
				novoVetor[i] = elementos[i];
			}
			this.elementos = novoVetor;
		}
	}
	
}
