package app;

public class Banda {

	public Tocar tocar;
	
	public void setTocar(Tocar tocar) {
		this.tocar = tocar;
	}
	
	public void executar() {
		this.tocar.tocar();
	}
	
}
