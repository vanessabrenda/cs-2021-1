package ipi;
import java.util.Scanner;
public class IPI {

	public static void main(String[] args) {
			 Scanner ler = new Scanner(System.in);
			 
			 float valor1; 
			 float valor2; 
			 float ipi;
			 int quant1;
			 int quant2;
			 System.out.printf("Informe a porcentagem de IPI: ");
			 ipi = ler.nextFloat();
			 System.out.printf("Informe o valor da primeira pe�a: ");
			 valor1 = ler.nextFloat();
			 System.out.printf("Informe a quantidade da primeira pe�a: ");
			 quant1 = ler.nextInt();
			 System.out.printf("Informe o valor da segunda pe�a: ");
			 valor2 = ler.nextFloat();
			 System.out.printf("Informe a quantidade da segunda pe�a: ");
			 quant2 = ler.nextInt();
			 
			 double valortotal;
			 
			 valortotal = (valor1 * quant1 + valor2*quant2) * (ipi/100 + 1);
			 
			 System.out.println("O valor total �: " + valortotal); 
	}

}
