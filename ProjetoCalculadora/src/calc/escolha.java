package calc;

public class escolha {
	// attributes
	private int option;

	// getters and setters
	public int getOption() {
		return option;
	}

	public void setOption(int option) {
		this.option = option;
	}

	// method
	public String retorno() {
		return "1- Somar dois n�meros || 2- Subtrair dois n�meros || 3- Multiplicar dois n�meros \n"
				+ "4- Dividir dois n�meros || 5- Pot�ncia de dois n�meros || 6- Raiz en�sima (n�mero e fator) \n"
				+ "7- % de dois n�meros || 8- Invers�o de sinal || -99 -> Para sair \n";
	}

}