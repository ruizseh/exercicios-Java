import java.util.*;
public class Exercicio6 {

	public static void main(String args[]) 
	{
	
		Scanner ler = new Scanner(System.in);
		int idade;
		
		System.out.printf("Insira sua idade: ");
		idade = ler.nextInt();
		
		if(idade >=5 && idade <=7)
		{
		System.out.println("Categoria: Infantil A");
		}
		
		else if(idade >= 8 && idade <= 11) {
			System.out.println("Categoria: Infantil B");
		}
		else if(idade >= 12 && idade <= 13) {
			System.out.println("Categoria: Juvenil A");
		}
		else if(idade >= 14 && idade <= 17) {
			System.out.println("Categoria: Juvenil B");
		}
		else if(idade >= 18) {
			System.out.println("Categoria: Adultos");
		}
		else {
			System.out.println("Você não esta apto a nenhuma das categorias");
		}
		
	}
	
}
