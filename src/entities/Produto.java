package entities;

public class Produto {
	
	private String nome;
	private Double valor;
	
	public Produto(String nome, Double valor) {
		this.nome = nome;
		this.valor = valor;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Double getValor() {
		return valor;
	}

	public void setValor(Double valor) {
		this.valor = valor;
	}
	
	//referencial com método estático
	public static boolean staticProdutoPredicate(Produto p) {
		return p.getValor() >= 100;
	}

	@Override
	public String toString() {
		return "Produto [nome=" + nome + ": valor=" + valor + "]";
	}
	
	
	
	
	

}
