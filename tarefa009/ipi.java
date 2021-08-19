package ipi;
import java.util.Scanner;
public class ipi {

	public static void main(String[] args) {
			 Scanner ler = new Scanner(System.in);
			 
			 float valor1, valor2, ipi;
			 int cod1, cod2, quant1, quant2;
			 System.out.printf("Informe a porcentagem de IPI: ");
			 ipi = ler.nextFloat();
			 System.out.printf("Informe o c�digo da primeira pe�a: ");
			 cod1 = ler.nextInt();
			 System.out.printf("Informe o valor da primeira pe�a: ");
			 valor1 = ler.nextFloat();
			 System.out.printf("Informe a quantidade da primeira pe�a: ");
			 quant1 = ler.nextInt();
			
			 System.out.printf("Informe o c�digo da segunda pe�a: ");
			 cod2 = ler.nextInt();
			 System.out.printf("Informe o valor da segunda pe�a: ");
			 valor2 = ler.nextFloat();
			 System.out.printf("Informe a quantidade da segunda pe�a: ");
			 quant2 = ler.nextInt();
			 
			 double valortotal;
			 
			 valortotal = (valor1 * quant1 + valor2*quant2) * (ipi/100 + 1);
			 
			 System.out.println("O valor total �: " + valortotal); 
	}

}
