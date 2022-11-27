package Leafs;

import Composite.Forma;

public class Triangulo implements Forma{
    @Override
	public void desenho(String corDesenho) {
		System.out.println("Desenho de triângulo com cor "+corDesenho);
	}    
}
