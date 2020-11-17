import java.util.*;
public class Exercicio6 {
	public static void main(String args[])
	{
		Scanner ler = new Scanner(System.in);
		int a,b,c;
		
		
		
		System.out.printf("Entre com o valor A: ");
		a = ler.nextInt();
		System.out.printf("Entre com o valor B: " );
		b = ler.nextInt();
		System.out.printf("Ente com o valor C: ");
		c = ler.nextInt();
		
		if(b == a || b == c || a == c)
		{
			System.out.println("Não é aceito valores iguais");
		}
		
		else if( a > b && a > c)
		{
			System.out.println("O maior nvalor é: " + a);
		}
		
		else if(b > c && b > a)
		{
			System.out.println("O maior valor é: " + b);
		}
		
		else if(c > a && c > b)
		{
			System.out.println("O maior valor é: " + c);
		}
	}
}
