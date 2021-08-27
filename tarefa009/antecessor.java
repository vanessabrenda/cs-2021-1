package antecessor;
import java.util.Scanner;

public class antecSuces {
	public static void main(String[] args) {
		 Scanner ler = new Scanner(System.in);
		 
		 int a;
		 System.out.printf("Informa o n�mero: ");
		 a = ler.nextInt();
		 int antec, suces;
		 antec = a - 1;
		 suces = a + 1;
		 
		 System.out.println("Antecessor: "+ antec);
		 System.out.println("Sucessor: "+ suces);
	}
}
