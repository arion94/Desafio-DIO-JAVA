
public class Main {

	public static void main(String[] args) {
		conta cc = new contaCorrente();
		conta poupança = new contaPoupança();
		
		cc.imprimirExtrato();
		poupança.imprimirExtrato();
		
	}

}
