package application;

import java.util.List;
import java.util.Scanner;

import entities.Calculadora;

public class Program {

	public static void main(String[] args) {
		Scanner sc;

		try {
			sc = new Scanner(System.in);
			while (true) {
				System.out.print("Vamos calcular os divisores do número: ");
				int numero = sc.nextInt();
				List<Integer> divisores = Calculadora.calcularDivisores(numero);
				System.out.println("Os divisores do número " + numero + " são:");
				System.out.println(divisores.toString());
				System.out.println("Deseja continuar (y/n)?");
				char op = sc.next().charAt(0);
				if (op == 'n') {
					break;
				}
			}
		} catch (Exception e) {
			e.getMessage();
		}
	}

}
