import java.util.*;
public class Exercicio2 {
		public static void main (String args[])
		
		{
			Scanner ler = new Scanner (System.in);
			int N,E,S;
			String C;
			
			System.out.printf("Entre com o código do funcionário: ");
			C = ler.next();
			System.out.printf("Quantidade de horas trabalhadas: ");
			N = ler.nextInt();
			
			if(N > 50)
			{
				
				E = (N - 50) * 20;
				S = (50 * 10) + E;
				System.out.println("O funcionário de código: " + C + ", excedeu as horas. O valor de seu sálario"
						+ "total é igual a: " + S + ",00 reais. O valor do salário excedente é: " + E + ",00 reais.");
			}	
		
			else {
				
				S = N * 10;
				System.out.println("O funcionário de código: " + C + ", não excedeu suas horas. O valor de seu"
						+ " salário é de: " + S + ",00 reais.");
			
			}
			
		}
		
		
}
