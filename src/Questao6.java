import java.util.Scanner;

public class Questao6 {
	public static void main(String[] args) {
		System.out.println("Digite o valor desejado:");
		Scanner scanner = new Scanner(System.in);
		int valor = scanner.nextInt();
		scanner.close();
		if(valor%5==0){
			System.out.println("É divisível");
		}
		else{
			System.out.println("Não é divisível");
		}
	}
}
