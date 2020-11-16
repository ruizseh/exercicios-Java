import java.util.*;
public class Exercicio8 {

	public static void main (String args[]) 
	{
	
		Scanner ler = new Scanner(System.in);
		int N;
		
		System.out.printf("Insira um número: ");
		N = ler.nextInt();
		
		if(N > 100) 
		{
			System.out.println("Seu numero é maior que 100: " + N);
		}
		
		else{
			N = 0;
			System.out.println("O valor inserido N é igual: " + N);
			  
			  
		}
	}
}
