import java.util.Scanner;
public class Exercicio5 {
	public static void main(String args[])
	{
		Scanner ler = new Scanner(System.in);
		int lados,h;
		double cm,a;
	
		
		System.out.printf("Digite o numro de lados: ");
		lados = ler.nextInt();
		
		System.out.printf("Digite a medida do lado em cm: " );
		cm = ler.nextDouble();
		
		if(lados == 3)
		{
			System.out.printf("Seu poligono é um triangulo, digite a altura: ");
			h = ler.nextInt();
			a = (cm * h) / 2;
			
			System.out.println("Seu poligono é um TRIANGULO de área: " + a);
			
		}
		
		else if(lados == 4)
		{
			a = cm * cm;
			System.out.println("Seu poligono é um QUADRADO de área: " + a);
	
		}
		
		else if (lados == 5)
		{
			System.out.println("Seu poligono é um PENTÁGONO!");
		}
		
		else if (lados < 3)
		{
			System.out.println("Não é um POLÍGONO");
		}
		
		else if (lados > 5)
		{
			System.out.println("POLLÍGONO não identificado");
		}
	}
}
