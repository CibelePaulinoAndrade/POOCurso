import java.util.Scanner;

public class Quest�o1 {
	public static void main(String[] args){
		System.out.println("Dist�ncia (km): ");
		Scanner scanner = new Scanner(System.in);  
		double d = scanner.nextDouble();
		System.out.println("Tempo(h): "); 
		double t = scanner.nextDouble();
		double v = d/t;
		System.out.println("A velocidade m�dia em km/h �:");
		System.out.println(v);	
		scanner.close();
	}
}
