package vetores;

public class Vetor {
	
	private Integer[] elementos;
	private Integer tamanho;
	
	public Vetor(Integer capacidade) {
		this.elementos = new Integer[capacidade];
		this.tamanho = 0;
	}
	
	public void adicionar(Integer novoElemento) {
		if(this.tamanho < this.elementos.length) {
			this.elementos[this.tamanho] = novoElemento;
			this.tamanho++;
		} else {
			throw new ArrayIndexOutOfBoundsException("Vetor ja esta em sua capacidade maxima");
		}
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
}
