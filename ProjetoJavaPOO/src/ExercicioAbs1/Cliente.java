package ExercicioAbs1;

public class Cliente {
	private String nome;
	private int idade;
	private String CPF;
	private String RG;
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public String getCPF() {
		return CPF;
	}
	public void setCPF(String cPF) {
		CPF = cPF;
	}
	public String getRG() {
		return RG;
	}
	public void setRG(String rG) {
		RG = rG;
	}
	@Override
	public String toString() {
		return "Cliente [nome=" + nome + ", idade=" + idade + ", CPF=" + CPF + ", RG=" + RG + "]";
	}
	
	

}
