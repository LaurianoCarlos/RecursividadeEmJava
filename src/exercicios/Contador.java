package exercicios;

public class Contador {

	public static void contar(int inicio, int fim) {

		if (inicio > fim) {
			return;
		}
		System.out.println(inicio);
		contar(inicio + 1, fim);
	}
}
