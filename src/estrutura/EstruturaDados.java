package estrutura;

public class EstruturaDados<T> {
	
	protected T[] elementos;
	protected Integer tamanho;
	
	public EstruturaDados(Integer capacidade) {
		this.elementos = (T[]) new Object[capacidade];
		this.tamanho = 0;
	}
	
	public EstruturaDados() {
		this(10);
	}
	
	protected boolean adicionar(T novoElemento) {
		this.aumentarCapacidade();
		if(this.tamanho < this.elementos.length) {
			this.elementos[this.tamanho] = novoElemento;
			this.tamanho++;
			return true;
		} else {
			return false;
		}
	}
	
	protected boolean adicionar(int posicao, T elemento) {
		if(!(posicao >= 0 && posicao < tamanho)) {
			throw new IllegalArgumentException("A posicao não existe no vetor");
		}
		
		this.aumentarCapacidade();
		for(int i = tamanho - 1; i >= posicao; i--) {
			this.elementos[i + 1] = this.elementos[i];
		}
		this.elementos[posicao] = elemento;
		this.tamanho++;
		
		return true;
	}
	
	protected void aumentarCapacidade() {
		if(tamanho == elementos.length) {
			T[] novoVetor = (T[]) new Object[this.elementos.length * 2];
			
			for(int i = 0; i < tamanho; i++) {
				novoVetor[i] = elementos[i];
			}
			this.elementos = novoVetor;
		}
	}
	
	public int tamanho() {
		return this.tamanho;
	}
	
	public boolean estaVazia() {
		return this.tamanho == 0;
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
