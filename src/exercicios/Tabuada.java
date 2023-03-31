package exercicios;

public class Tabuada {

	public static void tabuada(int num, int cont) {
	    if (num == 1)
	      return;

	    int r = num * cont;
	    System.out.printf("%d x %d = %d \n", num, cont, r);
	  }
}
