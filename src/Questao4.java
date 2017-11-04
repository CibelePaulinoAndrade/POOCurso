import java.util.Scanner;

public class Questao4 {
	public static void main(String[] args){
		System.out.println("Digite valor desejado:");
		Scanner scanner = new Scanner(System.in);
		int valor = scanner.nextInt();
		scanner.close();
		if(valor>20){
			System.out.println(valor);
		}
	}
}
