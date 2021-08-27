package reajuste;
import java.util.Scanner;

public class REAJUSTE {
	public static void main(String[] args) {
		 Scanner ler = new Scanner(System.in);
		 float saldo; 
		 System.out.printf("Informe o saldo: ");
		 saldo = ler.nextFloat();
		 
		 double reajuste;
		 reajuste = (saldo * 0.15) + saldo;
		 
		 System.out.println("Saldo reajustado: " + reajuste);
	}
}
