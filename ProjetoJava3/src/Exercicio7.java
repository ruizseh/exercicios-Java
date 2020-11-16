import java.util.*;
public class Exercicio7 {

	public static void main(String args[])
	{
		Scanner ler = new Scanner(System.in);
		float a,h,b;
			
		System.out.printf("Digite o valor da base: ");
		b = ler.nextFloat();
		
		System.out.printf("Digite o valor da altura: ");
		h = ler.nextFloat();
		
		if(b > 0 && h >0)
		{
		a = (b * h) / 2;
		
		System.out.println("Área do triangulo = " + a);
		}
		else
		{
			System.out.println("Valores inválidos para calculo de área do triangulo.");
		}
		
		
			
		
	}
}
