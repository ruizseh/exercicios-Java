package DesafioAbs1;

public class MainOperario {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Operario op1 = new Operario();
		
		op1.setNome("Mario");
		op1.setEndereco("Rua Jamaica, 456");
		op1.setTelefone("987654321");
		op1.setValorProducao(1500);
		op1.setComissao(0.30);
		
		
		System.out.println(op1.toString());
	}

}
