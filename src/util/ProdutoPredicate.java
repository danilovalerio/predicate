package util; // por se tratar de uma classe auxiliar apenas, ficar� no pacote �til

import java.util.function.Predicate;

import entities.Produto;

public class ProdutoPredicate implements Predicate<Produto>{

	//Interface funcional, pois possui somente um m�todo para ser implementado
	@Override
	public boolean test(Produto p) {
		
		return p.getValor() >= 100;
	}
}
