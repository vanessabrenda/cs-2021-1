package idade;
import java.util.Scanner;

public class idade {

	public static void main(String[] args) {
		 Scanner ler = new Scanner(System.in);
		 int dia, mes, ano; 
		 
		 System.out.printf("Informa o dia de nascimento: ");
		 dia = ler.nextInt();
		 System.out.printf("Informa o m�s (em n�mero) de nascimento: ");
		 mes = ler.nextInt();
		 System.out.printf("Informa o ano de nascimento: ");
		 ano = ler.nextInt();
		 
		 int dias = (dia + (mes * 30) + (ano * 365));
		 
		 System.out.println(dias);
	}

}
