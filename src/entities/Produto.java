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
	
	//referencia com m�todo est�tico (trabalha com o argumento que voc� passar para ele)
	public static boolean staticProdutoPredicate(Produto p) {
		return p.getValor() >= 100;
	}
	
	//referencia com m�todo n�o est�tico (trabalha com o pr�prio objeto em que estou)
	public boolean naoStaticProdutoPredicate() {
		return valor >= 100;
	}
	

	@Override
	public String toString() {
		return "Produto [nome=" + nome + ": valor=" + valor + "]";
	}
	
	
	
	
	

}
