package exercicios;

public class ExibirFrase {

	public static void exibirfrase(String frase, int num, int posicao) {
		int tamanho = frase.length();

		if (num == tamanho) {
			return;
		}

		if (frase.charAt(num) == ' ') {

			System.out.println("Espaço");
			posicao = posicao - 1;

		} else {

			System.out.println("Letra " + posicao + " = " + frase.charAt(num));

		}

		exibirfrase(frase, num + 1, posicao + 1);
	}
}
