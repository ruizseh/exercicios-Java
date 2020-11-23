package DesafioAbs1;

public class MainEmpregado {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Empregado emp01 = new Empregado();
		
		
		emp01.setNome("Luis");
		emp01.setEndereco("Rua abc, 34");
		emp01.setTelefone("12344321");
		emp01.setCodigoSetor(444);
		emp01.setSalarioBase(1500);
		emp01.setImposto(0.20);
		
		System.out.println(emp01.toString());
		
		
		
	}

}
