package Leafs;

import Composite.Forma;

public class Circulo implements Forma{
    @Override
	public void desenho(String corDesenho) {
		System.out.println("Desenho de círculo com cor "+corDesenho);
	}
}
