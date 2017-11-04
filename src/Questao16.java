
public class Questao16 {
	public static void main(String[] args){
		int[] vetor;
		vetor = new int[50];
		int aux = 0;
		for(int i=1; i<=100; i++){
			if(i%2==0){
				vetor[aux]=i;
				aux=aux+1;
			}
		}
		for(int i=0;i<50;i++){
			System.out.println(vetor[i]);
		}
	}
}
