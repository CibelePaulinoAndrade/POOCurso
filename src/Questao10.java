import java.util.Scanner;

public class Questao10 {
	public static void main(String[] args) {
		System.out.println("Digite o valor de x:");
		Scanner scanner = new Scanner(System.in);
		int x = scanner.nextInt();
		scanner.close();
		double t = (8/(2-x));
		System.out.println(t);
	}
}
