package ExercicioAbs3;

public class produtoEletronico {
	private String nome;
	private String marca;
	private double preco;
	private String cor;
	public String getNome() {
		return nome;
	}
	
	
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public double getPreco() {
		return preco;
	}
	public void setPreco(double preco) {
		this.preco = preco;
	}
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}



	@Override
	public String toString() {
		return "produtoEletronico [nome=" + nome + ", marca=" + marca + ", preco=" + preco + ", cor=" + cor + "]";
	}
	

}
