package util; // por se tratar de uma classe auxiliar apenas, ficará no pacote útil

import java.util.function.Predicate;

import entities.Produto;

public class ProdutoPredicate implements Predicate<Produto>{

	//Interface funcional, pois possui somente um método para ser implementado
	@Override
	public boolean test(Produto p) {
		
		return p.getValor() >= 100;
	}
}
