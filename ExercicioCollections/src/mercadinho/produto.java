package mercadinho;

public class produto {
	
	private String nome;
	double peso;
	int qtd;

	
	public produto(String nome, double peso, int qtd)
	{
		this.nome = nome;
		this.peso = peso;
		this.qtd = qtd;
		
	}
	
	
	@Override
	public String toString() {
		return nome + ", peso = " + peso + ", qtd = " + qtd;
	}
	
	
}
