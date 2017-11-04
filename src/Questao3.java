import java.util.Scanner;

public class Questao3 {
	public static void main(String[] args){
		System.out.println("Digite a temperatura em fahrenheit (°F): ");
		Scanner scanner = new Scanner(System.in);  
		double d = scanner.nextDouble();
		double c = (((d-32)*5)/9);
		System.out.printf("A temperatura em Celsius (°C) é: %.1f", c);	
		scanner.close();
	}
}
