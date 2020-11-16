import java.util.*;
public class Exercicio5 {

	public static void main(String args[])
	{
		Scanner ler = new Scanner(System.in);
		
		float indice;
		
		System.out.println("Qual o índice de poluição medido: ");
		indice = ler.nextFloat();
		
		if(indice >= 0.3 && indice < 0.4)
		{
			System.out.println("Suapenda as atividade do grupo 1!");
		}
		
		else if(indice >= 0.4 && indice <0.5)
		{
			System.out.println("Suapenda as atividades do grupo 1 e 2!");
		}
		else if(indice >= 0.5)
		{
			System.out.println("Suspende as atividades do grupo 1, 2 e 3!");
		}
		else if(indice > 0.25 && indice <= 0.29)
		{
			System.out.println("Estado de Alerta para grupo 1");
		}
		else if (indice <= 0.25)
		{
			System.out.println("Índices toleráveis, Parabéns!");
		}
		
		
		
	}
}
