package aplicacao;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

import entities.Produto;

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
		
		//expressao lambda inline
		double minimo = 100;
		list.removeIf(p -> p.getValor() >= minimo);
		
		for(Produto p : list) {
			System.out.println(p);
		}

	}

}
