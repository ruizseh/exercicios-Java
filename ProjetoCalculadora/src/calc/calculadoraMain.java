package calc;

import java.util.Scanner;

/*                                     PROJETO CALCULADORA EM JAVA                               	*/
/*                    	GRUPO: LUCAS GATO, BEATRIZ, VITOR BORELLA, CINTHIA, SERGIO                 */

public class calculadoraMain {
	public static void main(String[] args) {

		// variables
		escolha calculadora = new escolha();
		double a, b, memoria = 0;
		Scanner ler = new Scanner(System.in);

		do {
			// outputs
			System.out.println("Bem vindo a calculadora , escolha uma op��o para realizar uma opera��o: \n");
			// print of the choices
			System.out.println(calculadora.retorno());
			// read option input
			calculadora.setOption(ler.nextInt());

			if (calculadora.getOption() == -99) {
				break;
			}

			switch (calculadora.getOption()) {

			case 1: {
				// addition
				System.out.println("Op��o 1: Soma.");
				System.out.println("Digite o primeiro n�mero A:");
				a = ler.nextDouble();
				System.out.println("Digite o segundo n�mero B:");
				b = ler.nextDouble();
				System.out.println(a + " + " + b + " = " + (a + b));
				System.out.println();
				memoria = a + b;
				break;
			}

			case 2: {
				// subtraction
				System.out.println("Op��o 2: Subtra��o.");
				System.out.println("Digite o primeiro n�mero A:");
				a = ler.nextDouble();
				System.out.println("Digite o segundo n�mero B:");
				b = ler.nextDouble();
				System.out.println(a + " - " + b + " = " + (a - b));
				System.out.println();
				memoria = a - b;
				break;
			}

			case 3: {
				// multiplication
				System.out.println("Op��o 3: Multiplica��o.");
				System.out.println("Digite o primeiro n�mero A:");
				a = ler.nextDouble();
				System.out.println("Digite o segundo n�mero B:");
				b = ler.nextDouble();
				System.out.println(a + " * " + b + " = " + (a * b));
				System.out.println();
				memoria = a * b;
				break;
			}

			case 4: {
				// division
				System.out.println("Op��o 4: Divis�o.");
				System.out.println("Digite o primeiro n�mero A:");
				a = ler.nextDouble();
				System.out.println("digite o segundo numero B ");
				b = ler.nextDouble();
				System.out.println(a + " / " + b + " = " + (a / b));
				System.out.println();
				memoria = a / b;
				break;
			}

			case 5: {
				// elevated
				System.out.println("Op��o 5: Pot�ncia.");
				System.out.println("Digite o primeiro n�mero A:");
				a = ler.nextDouble();
				System.out.println("Digite o segundo n�mero B:");
				b = ler.nextDouble();
				System.out.println(a + " ^ " + b + " = " + Math.pow(a, b));
				System.out.println();
				memoria = Math.pow(a, b);
				break;
			}

			case 6: {
				// root
				System.out.println("Op��o 6: Raiz en�sima.");
				System.out.println("Digite o primeiro n�mero A dentro da raiz");
				a = ler.nextDouble();
				System.out.println("Digite o segundo n�mero B (raiz en�sima)");
				b = ler.nextDouble();
				Math.pow(a, 1.0 / b);
				System.out.println(a + " raiz " + b + " = " + (Math.pow(a, 1.0 / b)));
				System.out.println();
				memoria = Math.pow(a, 1.0 / b);
				break;
			}

			case 7: {
				// Percent
				System.out.println("Op��o 7: Porcentagem.");
				System.out.println("Digite o primeiro n�mero A:");
				a = ler.nextDouble();
				System.out.println("Digite o segundo n�mero B:");
				b = ler.nextDouble();
				System.out.println(a + " % " + b + " = " + ((a / 100) * b));
				System.out.println();
				memoria = (a / 100) * b;
				break;
			}
			case 8: {
				// change signal
				System.out.println("Op��o 8: Invers�o de sinal.");
				memoria = memoria * (-1);
				System.out.println(memoria);
				System.out.println();
				break;
			}
			default:
				System.out.println("Opcao inv�lida.");

			}

		} while (calculadora.getOption() != -99);
	}
}