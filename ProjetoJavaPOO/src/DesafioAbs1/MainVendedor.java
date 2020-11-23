package DesafioAbs1;

public class MainVendedor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Vendedor v01 = new Vendedor();
		
		v01.setNome("Ronaldo");
		v01.setEndereco("Rua Canada, 563");
		v01.setTelefone("90897765");
		v01.setValorVendas(500);
		v01.setComissao(0.25);

		
		System.out.println(v01.toString());
		
		
		
	}

}
