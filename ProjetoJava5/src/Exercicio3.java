import java.util.*;
public class Exercicio3 {
	public static void main(String argrs[])
	{
		Scanner ler = new Scanner(System.in);
		
		int idade = 0,menor21 = 0,maior50 = 0;
		
		
		while(idade != -99)
		{
			System.out.printf("Entre com a idade: ");
			idade = ler.nextInt();
			
			if(idade < 21 && idade > 0 )
			{
				menor21++;
			}
			else if(idade > 50)
			{
				maior50++;
			}
		}
		System.out.println("Pessoas com menos de 21 anos: " + menor21 + "." + " Pessoas com mais de 50: " + maior50 + ".");
			
			
		
	}
	
}		
			
			


