import java.util.Scanner;

public class Questão1 {
	public static void main(String[] args){
		System.out.println("Distância (km): ");
		Scanner scanner = new Scanner(System.in);  
		double d = scanner.nextDouble();
		System.out.println("Tempo(h): "); 
		double t = scanner.nextDouble();
		double v = d/t;
		System.out.println("A velocidade média em km/h é:");
		System.out.println(v);	
		scanner.close();
	}
}
