package aplicacao;

import java.util.ArrayList;
import java.util.List;

import entities.Produto;
import util.ProdutoPredicate;

/*
 * Fazer um programa que, a partir de uma lista de produtos, 
 * remova da lista somente aqueles cujo preço mínimo seja 100.
 * 
 */

public class Programa {

	public static void main(String[] args) {
		
		List<Produto> list = new ArrayList<>();
		list.add(new Produto("Tv", 900.00));
		list.add(new Produto("Mouse", 50.00));
		list.add(new Produto("Tablet", 350.50));
		list.add(new Produto("HD Case", 80.90));
		
		//Predicate com objeto
		//list.removeIf(new ProdutoPredicate());
		
		//predicate com referência para Método estático (Nome da Classe::nomeDoMetodo)
		//list.removeIf(Produto::staticProdutoPredicate);
				
		//predicate com referência para Método não estático (Nome da Classe::nomeDoMetodo)
		list.removeIf(Produto::naoStaticProdutoPredicate);
		
		for(Produto p : list) {
			System.out.println(p);
		}

	}

}
