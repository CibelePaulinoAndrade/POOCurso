import java.util.Scanner;

public class Questao15 {
	public static void main(String[] args) {
		System.out.println("Digite o número da conta:");
		Scanner scanner = new Scanner(System.in);
		int n = 0;
		int t = 0;
		int x = scanner.nextInt();
		if(x<0){
			System.out.println("Operação encerrada\n");
		}
		while(x>0){
			t=t+1;
			System.out.println("Digite o saldo:");
			double s = scanner.nextDouble();
			if(s>=0){
				System.out.printf("Conta: %d \nSaldo %.1f \nPositivo\n", x, s);
			}
			else{
				System.out.printf("Conta: %d \nSaldo %.1f \nNegativo\n", x, s);
				n=n+1;
			}
			System.out.println("Digite o número da conta:");
			x = scanner.nextInt();
			if(x<0){
				System.out.println("Operação encerrada\n");
			}
		}
		scanner.close();
		double p= ((n*100)/100);
		System.out.printf("Saldo negativo (%): %.1f%%\n", p);
	}
}
