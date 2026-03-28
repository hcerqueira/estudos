package teste;

public class Single {
	private int contador;
	private static Single instance = new Single();

	private Single() {
		this.contador = 0;
	}

	public static Single getInstance() {
		return instance;
	}

	public boolean solicitarInsercao(int n) {
		if(this.contador == n) {
			this.contador += 1;
			return true;
		}
		return false;
	}
}