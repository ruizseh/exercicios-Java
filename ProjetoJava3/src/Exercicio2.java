import java.util.*;
public class Exercicio2 {
		public static void main (String args[])
		
		{
			Scanner ler = new Scanner (System.in);
			int N,E,S;
			String C;
			
			System.out.printf("Entre com o c�digo do funcion�rio: ");
			C = ler.next();
			System.out.printf("Quantidade de horas trabalhadas: ");
			N = ler.nextInt();
			
			if(N > 50)
			{
				
				E = (N - 50) * 20;
				S = (50 * 10) + E;
				System.out.println("O funcion�rio de c�digo: " + C + ", excedeu as horas. O valor de seu s�lario"
						+ "total � igual a: " + S + ",00 reais. O valor do sal�rio excedente �: " + E + ",00 reais.");
			}	
		
			else {
				
				S = N * 10;
				System.out.println("O funcion�rio de c�digo: " + C + ", n�o excedeu suas horas. O valor de seu"
						+ " sal�rio � de: " + S + ",00 reais.");
			
			}
			
		}
		
		
}
