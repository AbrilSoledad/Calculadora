package ar.edu.unlam.interfaz;

import java.util.Scanner;

import ar.edu.unlam.dominio.CalculadoraDos;
import ar.edu.unlam.dominio.MenuCalculadora;

public class Calculadora {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);

		System.out.println("Bienvenidx a la Calculadora");

		CalculadoraDos calculadora = new CalculadoraDos();

		MenuCalculadora opcionElegida;

		do {
			mostrarMenu();

			opcionElegida = ingresarOpcion(teclado);

			double resultado = 0;
			double numUno;
			double numDos;
			int limite;
			int limiteInferior;
			int limiteSuperior;

			switch (opcionElegida) {
			case SALIR:
				System.out.println("Calculadora desactivada");
				break;
			case SUMAR:
				System.out.println("Opcion " + opcionElegida);
				System.out.println("Ingrese el primer operador: ");
				numUno = teclado.nextDouble();
				System.out.println("Ingrese el segundo operador: ");
				numDos = teclado.nextDouble();
				resultado = calculadora.sumar(numUno, numDos);
				System.out.println("El resultado de su suma es " + resultado);
				System.out.println("");
				break;
			case RESTAR:
				System.out.println("Opcion " + opcionElegida);
				System.out.println("Ingrese el primer operador: ");
				numUno = teclado.nextDouble();
				System.out.println("Ingrese el segundo operador: ");
				numDos = teclado.nextDouble();
				resultado = calculadora.restar(numUno, numDos);
				System.out.println("El resultado de su resta es " + resultado);
				System.out.println("");
				break;
			case MULTIPLICAR:
				System.out.println("Opcion " + opcionElegida);
				System.out.println("Ingrese el primer operador: ");
				numUno = teclado.nextDouble();
				System.out.println("Ingrese el segundo operador: ");
				numDos = teclado.nextDouble();
				resultado = calculadora.multiplicar(numUno, numDos);
				System.out.println("El resultado de su multiplicacion es " + resultado);
				System.out.println("");
				break;
			case DIVIDIR:
				System.out.println("Opcion " + opcionElegida);
				System.out.println("Ingrese el primer operador: ");
				numUno = teclado.nextDouble();
				System.out.println("Ingrese el segundo operador: ");
				numDos = teclado.nextDouble();
				resultado = calculadora.dividir(numUno, numDos);
				if (resultado == 0.0) {
					System.out.println("Error: division por cero");
				}
				System.out.println("El resultado de su division es " + resultado);
				System.out.println("");
				break;
			case POTENCIA:
				System.out.println("Opcion " + opcionElegida);
				System.out.println("Ingrese la base: ");
				double base = teclado.nextDouble();
				System.out.println("Ingrese el exponente: ");
				int exponente = teclado.nextInt();
				resultado = calculadora.potencia(base, exponente);
				System.out.println("El resultado de la potencia es " + resultado);
				System.out.println("");
				break;
			case SUMATORIA:
				System.out.println("Opcion " + opcionElegida);
				System.out.println("Ingrese el limite: ");
				limite = teclado.nextInt();
				resultado = calculadora.sumatoria(limite);
				System.out.println("El resultado de sumar los numeros menores al limite es " + resultado);
				System.out.println("");
				break;
			case SUMATORIALIMITES:
				System.out.println("Opcion " + opcionElegida);
				System.out.println("Ingrese el limite inferior: ");
				limiteInferior = teclado.nextInt();
				System.out.println("Ingrese el limite superior");
				limiteSuperior = teclado.nextInt();
				resultado = calculadora.sumatoriaLimites(limiteInferior, limiteSuperior);
				System.out.println(
						"El resultado de sumar los numeros mayores al limite inferior y menores al limite superior es "
								+ resultado);
				System.out.println("");
				break;
			case PRODUCTORIA:
				System.out.println("Opcion " + opcionElegida);
				System.out.println("Ingrese el limite: ");
				limite = teclado.nextInt();
				resultado = calculadora.productoria(limite);
				System.out.println("El resultado de multiplicar los numeros menores al limite es " + resultado);
				System.out.println("");
				break;
			case PRODUCTORIALIMITES:
				System.out.println("Opcion " + opcionElegida);
				System.out.println("Ingrese el limite inferior: ");
				limiteInferior = teclado.nextInt();
				System.out.println("Ingrese el limite superior");
				limiteSuperior = teclado.nextInt();
				resultado = calculadora.productoriaLimites(limiteInferior, limiteSuperior);
				System.out.println(
						"El resultado de multiplicar los numeros mayores al limite inferior y menores al limite superior es "
								+ resultado);
				System.out.println("");
				break;
			case CONTARDIVISORES:
				System.out.println("Opcion " + opcionElegida);
				System.out.println("Ingrese el numero: ");
				int numero = teclado.nextInt();
				String divisores = calculadora.contarDivisores(numero);
				System.out.println(divisores + " son divisores de " + numero);
				System.out.println("");
				break;
			case FACTORIAL:
				System.out.println("Ingrese el numero: ");
				int num = teclado.nextInt();
				resultado = calculadora.factorial(num);
				System.out.println("El factorial es " + resultado);
			}

			if (calculadora.esPositivo(resultado) == true) {
				System.out.println("El resultado es positivo");
				System.out.println("");
			}

		} while (opcionElegida != MenuCalculadora.SALIR);

		teclado.close();
	}

	private static MenuCalculadora ingresarOpcion(Scanner teclado) {
		MenuCalculadora opcionElegida = MenuCalculadora.SALIR;
		int opcion = 0;

		do {
			opcion = teclado.nextInt();
			if (opcion >= 0 && opcion < MenuCalculadora.values().length) {
				opcionElegida = MenuCalculadora.values()[opcion];
			} else {
				System.out.println("Opcion invalida");
				mostrarMenu();
			}

		} while (opcion < 0 || opcion > MenuCalculadora.values().length);
		return opcionElegida;
	}

	private static void mostrarMenu() {

		for (int i = 0; i < MenuCalculadora.values().length; i++) {

			System.out.println("Ingrese " + i + " " + MenuCalculadora.values()[i]);
		}
	}

}
