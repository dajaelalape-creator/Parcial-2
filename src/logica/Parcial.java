package logica;

public class Parcial {
	
	public int calcularPotencia (int base, int exponente) throws Exception{
		if (base < 0 || exponente < 0) {
			throw new Exception("Base o exponente negativo");
		} else if (base == 0 && exponente == 0) {
			throw new Exception ("Base y exponente iguales a 0");
		} else {
			int resultado = 1;
			for (int i=0; i<exponente; i++) {
				resultado *= base;
			}
			return resultado;
		}
	}
}
