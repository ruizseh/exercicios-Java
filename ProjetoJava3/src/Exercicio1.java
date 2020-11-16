import java.util.*;

public class Exercicio1 {

	public static void main (String args[])
	{
		Scanner ler = new Scanner (System.in);
		
		int p,e,m;
		
		System.out.println("Peso dos tomates: ");
		p = ler.nextInt();
		
		if(p <= 50) 
		{
			System.out.println("Tudo certo, não há valor excedente!");
				
		}
		
		else if(p > 50)
		{
			
			e = p - 50;
			m = 4 * e;
			
			System.out.println("Você excedeu o total de: " + e + "Kg" + " e deve pagar: " + "R$" + m + ",00");
		}
		
		
		
	}

}