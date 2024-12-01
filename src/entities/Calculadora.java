package entities;

import java.util.ArrayList;
import java.util.List;

public class Calculadora {
	
	public static List<Integer> calcularDivisores(int numero) {
		List<Integer> divisores = new ArrayList<>();
		for(int i = 1; i <= numero; i++) {
			if(numero % i == 0) {
				divisores.add(i);
			}
		}
		return divisores;
	}
	
}
