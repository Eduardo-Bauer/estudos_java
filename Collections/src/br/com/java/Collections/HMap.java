package br.com.java.Collections;

import java.util.HashMap;
import java.util.Map;

public class HMap {
	public static void main(String[] args) {
		Map<String, String> caixa = new HashMap<String, String> ();
		
		caixa.put("M2225", "Fernando");
		caixa.put("M2226", "Maria");
		caixa.put("M2227", "Soraya");
		
		System.out.println(caixa.isEmpty()); // false
		System.out.println(caixa.size()); // 3
		System.out.println(caixa.containsKey("M2225")); // true
		System.out.println(caixa.containsValue("Fernando")); //true
		System.out.println(caixa);
	}

}
