import java.util.Scanner;

public class Questao20 {
	public static void main(String[] args){
		int[][] matriz;
		matriz = new int[3][3];
		Scanner scanner = new Scanner(System.in);
		System.out.println("Digite a matriz (3 x 3):");
		for(int i = 0; i<3; i++){
			for(int j = 0; j<3; j++){
				matriz[i][j] = scanner.nextInt();
			}
		}
		int aux = matriz[0][0];
		matriz[0][0] = matriz[2][2];
		matriz[2][2] = aux;
		aux = matriz[0][1];
		matriz[0][1] = matriz[2][1];
		matriz[2][1] = aux;
		aux = matriz[0][2];
		matriz[0][2] = matriz[2][0];
		matriz[2][0] = aux;
		aux = matriz[1][0];
		matriz[1][0] = matriz[1][2];
		matriz[1][2] = aux;
		for(int i = 0; i<3; i++){
			for(int j = 0; j<3; j++){
				System.out.printf("%d ",matriz[i][j]);
			}
			System.out.printf ("\n");
		}
		scanner.close();
	}
}
