package exercicios;

public class Potencia {

	public static int potencia(int numero, int expoente) {

		if (expoente < 1) {
			return 1;
		}

		return numero * potencia(numero, expoente - 1);
	}
}
