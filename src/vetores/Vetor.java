package vetores;

public class Vetor {
	
	private Integer[] elementos;
	private Integer tamanho;
	
	public Vetor(Integer capacidade) {
		this.elementos = new Integer[capacidade];
		this.tamanho = 0;
	}
	
	public boolean adicionar(Integer novoElemento) {
		this.aumentarCapacidade();
		if(this.tamanho < this.elementos.length) {
			this.elementos[this.tamanho] = novoElemento;
			this.tamanho++;
			return true;
		} else {
			return false;
		}
	}
	
	public void adicionar(int posicao, int elemento) {
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
	
	public String buscarPosicao(int posicao) {
		if(!(posicao >= 0 && posicao < tamanho)) {
			throw new IllegalArgumentException("A posicao não existe no vetor");
		}		
		return this.elementos[posicao].toString();
	}
	
	public boolean buscarElemento(int elemento) {
		for(int i = 0; i < tamanho; i++) {
			if(this.elementos[i] == elemento) return true;
		}
		return false;
	}
	
	public int tamanho() {
		return this.tamanho;
	}
	
	private void aumentarCapacidade() {
		if(tamanho == elementos.length) {
			Integer[] novoVetor = new Integer[elementos.length * 2];
			
			for(int i = 0; i < tamanho; i++) {
				novoVetor[i] = elementos[i];
			}
			this.elementos = novoVetor;
		}
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
}
