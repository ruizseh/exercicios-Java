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
			System.out.printf("Seu poligono � um triangulo, digite a altura: ");
			h = ler.nextInt();
			a = (cm * h) / 2;
			
			System.out.println("Seu poligono � um TRIANGULO de �rea: " + a);
			
		}
		
		else if(lados == 4)
		{
			a = cm * cm;
			System.out.println("Seu poligono � um QUADRADO de �rea: " + a);
	
		}
		
		else if (lados == 5)
		{
			System.out.println("Seu poligono � um PENT�GONO!");
		}
		
		else if (lados < 3)
		{
			System.out.println("N�o � um POL�GONO");
		}
		
		else if (lados > 5)
		{
			System.out.println("POLL�GONO n�o identificado");
		}
	}
}
