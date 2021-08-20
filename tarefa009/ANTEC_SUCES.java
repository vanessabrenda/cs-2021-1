package antecessor;
import java.util.Scanner;

public class ANTEC_SUCES {
	public static void main(String[] args) {
		 Scanner ler = new Scanner(System.in);
		 
		 int a;
		 System.out.printf("Informa o número: ");
		 a = ler.nextInt();
		 int antec;
		 int suces;
		 antec = a - 1;
		 suces = a + 1;
		 
		 System.out.println("Antecessor: "+ antec);
		 System.out.println("Sucessor: "+ suces);
	}
}
