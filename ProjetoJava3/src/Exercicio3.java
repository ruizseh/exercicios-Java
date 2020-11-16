import java.util.*;
public class Exercicio3 {

	public static void main(String args[])
	
	{
		Scanner ler = new Scanner (System.in);
		int a,b,c,d,qa,qb,qc,qd;
		
		System.out.printf("Entre com valor A: ");
		a = ler.nextInt();
		System.out.printf("Entre com o valor B: ");
		b = ler.nextInt();
		System.out.printf("Entre com o valor de C: ");
		c = ler.nextInt();
		System.out.printf("Entre com o valor de D: ");
		d = ler.nextInt();
		
		qa = a * a;
		qb = b * b;
		qc = c * c;
		qd = d * d;
		
		if(qc >= 1000)
		{
		
			System.out.println("Numero: " + c + " Quadrado igual a: " + qc);
			
		}else
		{
			System.out.println("Numero: " + a + " Quadrado igual a: " + qa);
			System.out.println("Numero: " + b + " Quadrado igual a: " + qb);
			System.out.println("Numero: " + c + " Quadrado igual a: " + qc);
			System.out.println("Numero: " + d + " Quadrado igual a: " + qd);
			
			
		}
		
		
		
	}
	
	
}
