import java.util.*;
public class Exercicio4 {

	public static void main(String args[])
	{
		Scanner ler = new Scanner(System.in);
		
		int N;
		System.out.printf("Entre com o número: ");
		N = ler.nextInt();
		
		if(N % 2 == 0 && N >= 0) 
		{
			System.out.println("Numero par e positivo");
		}
		else if(N % 2 == 0 && N < 0)
		{
			System.out.println("Numero par e negativo");
		}
		else if(N % 2 != 0 && N > 0)
		{
			System.out.println("Numero impar e positivo");
		}
		else if(N % 2 != 0 && N < 0)
		{
			System.out.println("Numero impar e negativo");
		}
		
		
	}
	
}
