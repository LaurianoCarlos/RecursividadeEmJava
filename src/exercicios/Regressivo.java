package exercicios;

public class Regressivo {

	public static void contarRegressivo(int num) {
	    if (num < 0)
	      return;
	    
	    System.out.println(num);
	    contarRegressivo(num - 1);
	  }
}
