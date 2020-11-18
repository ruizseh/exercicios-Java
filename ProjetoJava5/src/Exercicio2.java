import java.util.*;
public class Exercicio2 {
	 public static void main(String args [])
	 {
		 Scanner ler = new Scanner(System.in);
		 
		 int n,i,par = 0, impar = 0;
			
			for(i = 0; i < 10; i++) {
				System.out.printf("Entre com 10 números: ");
				n = ler.nextInt();
				
				if(n % 2 == 0) {
					par++;
			}
				else {
					impar++;
				}
				
			}
			System.out.println("O total de númeors pares são: " + par + ". " + 
					"E o total de números impares são: " + impar + ".");
				
			
		}
	}