import java.util.Scanner;

public class Questao17 {
	public static void main(String[] args){
		int[] vetor;
		vetor = new int[80];
		int aux = 0, aux1 = 0, aux2 = 0, aux3 = 0, aux4 = 0, aux5 = 0, aux6 = 0, aux7 = 0, aux8 = 0, aux9 = 0, aux10 = 0;
		System.out.println("Digite as notas (80):");
		Scanner scanner = new Scanner(System.in);
		for(int i=0; i<=79; i++){
			vetor[i]=scanner.nextInt();
			if(vetor[i]<0 && vetor[i]>10){
				System.out.println("Informe apenas valores entre 0 e 10");
				vetor[i]=scanner.nextInt();
			}
			switch(vetor[i]){
			case 0:
				aux++;
				break;
			case 1: 
				aux1++;
				break;
			case 2:
				aux2++;
				break;
			case 3:
				aux3++;
				break;
			case 4:
				aux4++;
				break;
			case 5:
				aux5++;
				break;
			case 6:
				aux6++;
				break;
			case 7:
				aux7++;
				break;
			case 8:
				aux8++;
				break;
			case 9:
				aux9++;
				break;
			case 10:
				aux10++;
				break;
			default:
				break;
			}
		}
		scanner.close();
		System.out.println("        FA FR");
		System.out.printf("Nota 0: %d %d\nNota 1: %d %d\nNota 2: %d %d\nNota 3: %d %d\nNota 4: %d %d\nNota 5: %d %d\n", aux, ((100*aux)/80), aux1, ((100*aux1)/80), aux2, ((100*aux2)/80), aux3, ((100*aux3)/80), aux4, ((100*aux4)/80), aux5, ((100*aux5)/80));
		System.out.printf("Nota 6: %d %d\nNota 7: %d %d\nNota 8: %d %d\nNota 9: %d %d\nNota 10: %d %d\n", aux6, ((100*aux6)/80), aux7, ((100*aux7)/80), aux8, ((100*aux8)/80), aux9, ((100*aux9)/80), aux10, ((100*aux10)/80));
	}
}
