package salario;
import java.util.Scanner;

public class SALARIO {

	public static void main(String[] args) {
		 Scanner ler = new Scanner(System.in);
		 float salario;
		 float salariomin;
		 System.out.printf("Informa o sal�rio m�nimo: ");
		 salariomin = ler.nextFloat();
		 System.out.printf("Informa o sal�rio: ");
		 salario = ler.nextFloat();
		 
		 double qntsalario;
		 qntsalario = salario/salariomin;
		 
		 System.out.println("Quantos sal�rios recebe: " + qntsalario);
	}

}
