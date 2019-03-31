import java.util.Scanner;

public class Teste {

	public static void main(String[] args) {
		int[] v = new int[8];
		NDamas nd = new NDamas();
		
		Scanner scan = new Scanner(System.in);
		int itemDeEntrada;
		int[] entrada = new int[8];
		for(int i = 0; i < entrada.length; i++) {
			String itemDeEntada = scan.nextLine(); //le entrada
			entrada[i] = Integer.parseInt(itemDeEntada);
		}		
		nd.comparaNDamas(v, 0, 8, entrada);
	}
}

