import java.util.Scanner;

public class Questao8 {
		public static void main(String[] args){
			System.out.println("Digite a idade do competidor:");
			Scanner scanner = new Scanner(System.in);
			int idade = scanner.nextInt();
			scanner.close();
			if(idade>=5 && idade<=7){
				System.out.println("Infantil A");
			}
			else if(idade>=8 && idade<=10){
				System.out.println("Infantil B");
			}
			else if (idade>=11 && idade<=13){
				System.out.println("Juvenil A");
			}
			else if (idade>=14 && idade<=17){
				System.out.println("Juvenil B");
			}
			else if (idade>=18){
				System.out.println("Sênior");
			}
		}
}
