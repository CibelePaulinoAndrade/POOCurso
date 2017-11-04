import java.util.Locale;
import java.util.Scanner;

public class Questao9 {
	public static void main(String[] args){
		System.out.println("Digite o valor de x:");
		Scanner scanner = new Scanner(System.in);
		scanner.useLocale(Locale.US);
		double x = scanner.nextDouble();
		scanner.close();
		if(x<=1.0){
			System.out.println("1");
		}
		else if(x<1.0 && x<=2.0){
			System.out.println("2");
		}
		else if (x>=2.0 && x<=3.0){
			System.out.printf("%.2f", (x*x));
		}
		else if (x>3.0){
			System.out.printf("%.2f", (x*x*x));
		}
	}
}
