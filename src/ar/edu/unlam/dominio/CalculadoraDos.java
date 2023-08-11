package ar.edu.unlam.dominio;

public class CalculadoraDos {

	public CalculadoraDos() {

	}

	public double sumar(double numUno, double numDos) {
		return numUno + numDos;
	}

	public double restar(double numUno, double numDos) {
		return numUno - numDos;
	}

	public double multiplicar(double numUno, double numDos) {
		return numUno * numDos;
	}

	public double dividir(double numUno, double numDos) {
		if (numDos != 0) {
			return numUno / numDos;
		} else {
			return 0.0;
		}
	}

	public double potencia(double base, int exponente) {
		double resultado = 1.0;

		if (exponente >= 0) {
			for (int i = 1; i <= exponente; i++) {
				resultado *= base;
			}
		} else {
			for (int i = 1; i <= -exponente; i++) {
				resultado /= base;
			}
		}

		return resultado;
	}

	public double sumatoria(int limite) {
		int resultado = 0;

		for (int i = 1; i < limite; i++) {
			resultado += i;
		}

		return resultado;
	}

	public double sumatoriaLimites(int limiteInferior, int limiteSuperior) {
		int resultado = 0;

		for (int i = limiteInferior; i <= limiteSuperior; i++) {
			resultado += i;
		}

		return resultado;
	}

	public double productoria(int limite) {
		int resultado = 1;

		for (int i = 1; i < limite; i++) {
			resultado *= i;
		}

		return resultado;
	}

	public double productoriaLimites(int limiteInferior, int limiteSuperior) {
		int resultado = 1;

		for (int i = limiteInferior; i <= limiteSuperior; i++) {
			resultado *= i;
		}

		return resultado;
	}

	public String contarDivisores(int numero) {
		String resultado = "";
		for (int i = 1; i <= numero; i++) {
			if (numero % i == 0) {
				resultado += i + " ";
			}
		}
		return resultado;
	}

	public boolean esPositivo(double resultado) {
		return resultado > 0;
	}

	public double factorial(int num) {
		
		int factorial = 1;
		
		for(int i = num; i > 0; i--) {
			factorial = factorial * i;
		}
			
		return factorial;
	}

	
	
	
	
	
 }


