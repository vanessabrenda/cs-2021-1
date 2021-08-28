package media;

public class MEDIA {

	public static void main(String[] args) {
		
		double media1;
		double media2;
		double soma; 
		double media3;
		media1 = (8 + 9 + 7)/3;
		media2 = (4 + 5 +6)/3;
		
		soma = media1 + media2;
		media3 = (media1 + media2)/2;
		
		System.out.println("A media entre 8, 9 e 7: " + media1);
		System.out.println("A media entre 4, 5 e 6: " + media2);
		System.out.println("A soma das medias: " + soma);
		System.out.println("A media das medias: " + media3);
	}

}
