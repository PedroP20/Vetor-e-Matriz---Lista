public class exercicio09 {

	public static void main(String[] args) {
		int i;
		int A[] = new int[50];
		
		System.out.println("[+] Vetor de 50 posi��es presetado ...");
		System.out.println("[+] Imprimindo Vetor V ");
		
		for(i=0;i<A.length;i++) {
			A[i]=(i+5*i)%(i+1);
		}
		for(i=0;i<A.length;i++) {
			System.out.printf("\n[+] Vetor["+i+"]:%4d",A[i]);
		}
	}

}
