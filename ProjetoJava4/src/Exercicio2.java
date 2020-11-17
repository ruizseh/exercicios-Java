import java.util.*;
public class Exercicio2 {
	public static void main (String args[]) 
	{
		Scanner ler = new Scanner(System.in);
		int senha;
		
		System.out.printf("Digite a senha: ");
		senha = ler.nextInt();
		
		if(senha == 1234) 
		{
			System.out.printf("Acesso permitido!");
		}
		else 
		{
			System.out.printf("Acesso negado!");
		}
		
		
	}
}
