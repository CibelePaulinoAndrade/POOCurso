import java.util.Scanner;

public class Questao5 {
	public static void main(String[] args){
		System.out.println("Digite valor desejado:");
		Scanner scanner = new Scanner(System.in);
		int valor = scanner.nextInt();
		scanner.close();
		if(valor%2==0){
			System.out.println("PAR");
		}
		else{
			System.out.println("ÍMPAR");
		}
	}
}
