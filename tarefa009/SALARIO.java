package salario;
import java.util.Scanner;

public class SALARIO {

	public static void main(String[] args) {
		 Scanner ler = new Scanner(System.in);
		 float salario;
		 float salariomin;
		 System.out.printf("Informa o salário mínimo: ");
		 salariomin = ler.nextFloat();
		 System.out.printf("Informa o salário: ");
		 salario = ler.nextFloat();
		 
		 double qntsalario;
		 qntsalario = salario/salariomin;
		 
		 System.out.println("Quantos salários recebe: " + qntsalario);
	}

}
