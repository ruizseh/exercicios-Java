import java.util.*;
public class Exercicio1 {
		public static void main(String args[])
		{
			Scanner ler = new Scanner(System.in);
			int a,b;
			
			System.out.printf("Entre com o primeiro n�mero: ");
			a = ler.nextInt();
			System.out.printf("Entre com o segundo numero: ");
			b = ler.nextInt();
			
			if(b == a) 
			{
				System.out.printf("O valor dos numeros n�o pode ser repitidos!");
			}
		    
			else if(a > b) 
			{
				System.out.println("O maior valor �: " + a);
			}
			
			else
			{
				System.out.println("O maior valor �: " + b);
			}
			
		}
}
