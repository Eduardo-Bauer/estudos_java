package br.com.java.Collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Collection {
	public static void main(String[] args) {
		List<String> carrinho = new ArrayList<String>();
		
		System.out.println(carrinho.isEmpty()); // true
		
		carrinho.add("maça");
		carrinho.add("uva");
		carrinho.set(1, "banana"); // vai mudar o valor do uva
		carrinho.add("maça");
		
		System.out.println(carrinho.get(1)); // banana
		
		System.out.println(carrinho.size()); // 3
		
		System.out.println(carrinho.contains("maça")); // true
		
		System.out.println(carrinho.indexOf("banana")); // 1
		
		System.out.println(carrinho.get(carrinho.indexOf("maça"))); // maça
		
		System.out.println(carrinho.lastIndexOf("maça")); // 2
		
		Set<String> cesta = new HashSet<String>();
		
		System.out.println(cesta.isEmpty());
		cesta.add("Maça");
		cesta.add("Maça");
		cesta.add("maça");
		System.out.println(cesta.isEmpty());
		
		System.out.println(cesta.size());
		
		System.out.println(cesta);
		
		
	} 
}
