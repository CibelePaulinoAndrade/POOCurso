import java.util.Scanner;

public class Questao2 {
	public static void main(String[] args){
		double[] alunos = new double[5];
		System.out.println("Aluno: ");
		Scanner scanner = new Scanner(System.in);  
		String nome = scanner.nextLine();
		System.out.println("Notas(5): ");
		for(int i = 0;i<5;i++){
			alunos[i] = scanner.nextDouble();
		}
		double media=0;
		for(int i = 0;i<5;i++){
			media=media+alunos[i];
		}
		media=media/5;
		System.out.println(nome);	
		System.out.println("A média é:");
		System.out.println(media);
		scanner.close();
	}
}
