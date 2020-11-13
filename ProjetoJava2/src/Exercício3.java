import java.util.Scanner;
public class Exercício3 {
	public static void main(String args[]) {
		
		Scanner ler = new Scanner(System.in); 
		int A,B,C,D,R,S;
		
		System.out.println("Entre com valor de A: ");
		A = ler.nextInt();
		System.out.println("Entre com o valor de B: ");
		B = ler.nextInt();
		System.out.println("Entre com valor de C: ");
		C = ler.nextInt();
		
		R = (A + B) * (A + B);
		S = (B + C) * (B + C);
		D = (R + S)/2;
		System.out.println("S = " + S +" "  + "R = " + R
				           + "\n" + "D = " + D);
		
				
	
	}
}
