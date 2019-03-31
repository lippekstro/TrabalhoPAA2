public class NDamas {
	public int cont = 1;
	int[] cs = new int[8];
	int menor = 0;
	
	public void executaNDamas(int v[], int index, int n) {
		
		if(index == n) {
			System.out.print(cont++ +  ": " + v[0]);
			for(int i = 1; i < n; i++) {
				System.out.print(" " + v[i]);
			}
			System.out.println("\n");
		} else {
			for(int i = 1; i <= n; i++) {
				boolean ok = true;
				for(int j = 0; j < index; j++) {
					if(v[j] == i) {
						ok = false;
						break;
					}
					int diff = index - j;
					if(v[j] == i - diff || v[j] == i+diff) {
						ok = false;
						break;
					}
				}
				if(ok) {
					v[index] = i;
					executaNDamas(v, index + 1, n);
				}
			}
		}
	}
	
	public void comparaNDamas(int v[], int index, int n, int[] entrada) {
			
		if(index == n) {
			System.out.print("case " + cont++ +  ": ");
			int contador = 0;
			for(int i = 0; i < v.length; i++) {
				 int aux = v[i] - entrada[i]; //percorre o array vendo se tem diferenca entre a posicao que ela deveria ficar (conjunto das solucoes) e a posicao atual da rainha (vetor de entrada)
				 if(aux != 0) { //se tem diferenca (pode dar numero negativo) 
					 contador++; //entao conta um movimento a mais naquela solucao
				 }
			}
			
			System.out.println(contador);
			System.out.println("\n");
		} else {
			for(int i = 1; i <= n; i++) {
				boolean ok = true;
				for(int j = 0; j < index; j++) {
					if(v[j] == i) {
						ok = false;
						break;
					}
					int diff = index - j;
					if(v[j] == i - diff || v[j] == i+diff) {
						ok = false;
						break;
					}
				}
				if(ok) {
					v[index] = i;
					comparaNDamas(v, index + 1, n, entrada);
				}
			}
		}
	}
}