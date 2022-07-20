
public class contaPoupança extends conta {
	
	@Override
	public void imprimirExtrato() {
		System.out.println("===Extrato Conta Poupança===");
		super.imprimirInfosComuns();
		
	}



}
