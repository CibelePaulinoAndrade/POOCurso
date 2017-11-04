import java.util.Scanner;

public class Questao19 {
	public static void main(String[] args){
		int[][] matriz;
		matriz = new int[10][10];
		System.out.println("Digite os valores da matriz (10 x 10):");
		Scanner scanner = new Scanner(System.in);
		for(int i = 0; i<10; i++){
			for(int j = 0; j<10; j++){
				matriz[i][j] = scanner.nextInt();
			}
		}
		System.out.println("Diagonal principal da matriz: ");
		for(int i = 0; i<10; i++){
			for(int j = 0; j<10; j++){
				if(i!=j){
					System.out.println(matriz[i][j]);
				}
			}
		}
		scanner.close();
	}
}
