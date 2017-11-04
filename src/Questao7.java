import java.util.Scanner;

public class Questao7 {
	public static void main(String[] args) {
		System.out.println("Digite os valores de A, B e C:");
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		int c = scanner.nextInt();
		scanner.close();
		 if ((a < b) && (b < c)){
		     System.out.printf("%d - %d - %d", a, b, c);
		 }
		  else if ((a < c) && (c < b)){
			  System.out.printf("%d - %d - %d", a, c, b);
		  } 
		       else if ((b < a) && (a < c)){
		    	   System.out.printf("%d - %d - %d", b, a, c);
		       }
			    else if ((b < c) && (c < a)){
			    	System.out.printf("%d - %d - %d", b, c, a);
			    }
				 else if ((c < a) && (a < b)){
					 System.out.printf("%d - %d - %d", c, a, b);
				 }
				      else{
				    	  System.out.printf("%d - %d - %d", c, b, a);
				      }
	}
}
