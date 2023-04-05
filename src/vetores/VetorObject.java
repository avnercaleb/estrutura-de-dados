package vetores;

public class VetorObject {
	
	private Object[] elementos;
	private Integer tamanho;
	
	public VetorObject(Integer capacidade) {
		this.elementos = new Object[capacidade];
		this.tamanho = 0;
	}
	
	public boolean adicionar(Object novoElemento) {
		this.aumentarCapacidade();
		if(this.tamanho < this.elementos.length) {
			this.elementos[this.tamanho] = novoElemento;
			this.tamanho++;
			return true;
		} else {
			return false;
		}
	}
	
	public void adicionar(int posicao, Object elemento) {
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
	
	public int buscarElemento(Object elemento) {
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
			Object[] novoVetor = new Integer[elementos.length * 2];
			
			for(int i = 0; i < tamanho; i++) {
				novoVetor[i] = elementos[i];
			}
			this.elementos = novoVetor;
		}
	}
	
}
