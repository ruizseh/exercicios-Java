package ExercicioAbs2;

public class Aviao {

	private String modelo;
	private double tamanho;
	private int capacidade;
	private String companhia;
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public double getTamanho() {
		return tamanho;
	}
	public void setTamanho(double tamanho) {
		this.tamanho = tamanho;
	}
	public int getCapacidade() {
		return capacidade;
	}
	public void setCapacidade(int capacidade) {
		this.capacidade = capacidade;
	}
	public String getCompanhia() {
		return companhia;
	}
	public void setCompanhia(String companhia) {
		this.companhia = companhia;
	}
	@Override
	public String toString() {
		return "Aviao [modelo=" + modelo + ", tamanho=" + tamanho + ", capacidade=" + capacidade + ", companhia="
				+ companhia + "]";
	}
	
	
}
