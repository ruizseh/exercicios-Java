import java.util.Scanner;
public class Exerc�cio2 {
	public static void main(String args[]) {
		
		Scanner ler = new Scanner(System.in);
		
		float custoFabrica;
		double imposto,porcentagemDis,total;
		
		System.out.println("Entre com o valor de f�brica: ");
		custoFabrica = ler.nextFloat();
		
		imposto = 0.28 * custoFabrica;
		porcentagemDis = 0.45 * custoFabrica;
		
		total = (imposto + porcentagemDis + custoFabrica);
		
		System.out.println("Valor total do carro: " + total);
		

		
		
		
	}
	

}
