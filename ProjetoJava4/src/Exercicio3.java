import java.util.*;
public class Exercicio3 {
	public static void main(String args [])
	{
		Scanner ler = new Scanner(System.in);
		double maca;
		
		System.out.printf("Quantas ma��s voc� vai levar?");
		maca = ler.nextDouble();
		
		
		
		if(maca <= 3)
		{
			maca = maca * 0.30;
			System.out.println("O valor a ser pago � de: " + maca + " centavos.");
		}
		
		
		else if(maca < 12 && maca > 3)
		{
			maca = maca * 0.30;
			System.out.println("O valor a ser pago � de: " + maca + " reais.");
		}
		
		
		
		else if(maca >= 12)
		{
			maca = maca * 0.25;
			System.out.println("O valor a ser pago � de: " + maca + " reais.");
			
		}
	
	
	}
	
}
