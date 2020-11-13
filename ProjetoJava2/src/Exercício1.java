import java.util.Scanner;
public class Exercício1 {
	public static void main(String args[]) {
		
		Scanner ler = new Scanner(System.in);
		float a,b,c,media;
		System.out.println("Entre com o valor de nota A:");
		a = ler.nextFloat();
		System.out.println("Entren com o valor de nota B: ");
		b = ler.nextFloat();
		System.out.println("Entre com o valor de nota C: ");
		c = ler.nextFloat();
		
		media = ((2 * a) + (3 * b) + (5 * c)) / (2 + 3 + 5);
		
		System.out.println("Media ponderada = " + media);
		
	}

}
