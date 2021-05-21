package pascal;

public class Pascal {

	public static void main(String[] args) {
		int tamanho = 8;
		int vetor[][] = new int[tamanho][tamanho];
		
		for(int i = 0;i<tamanho;i++){
			vetor[i][0] = 1;
			for(int j=0;j<tamanho;j++) {
				if(j+1<tamanho && i+1<tamanho){
				vetor[i+1][j+1] = vetor[i][j]+vetor[i][j+1];
				}else {
				break;
				}
			}
		}
		
		for(int i = 0; i<tamanho;i++) {
			for (int j = 0 ; j<tamanho; j++){
				if(vetor[i][j]!=0) {
				System.out.print(vetor[i][j]+" ");
			    }
			}
		System.out.println();
		}
	}
}
