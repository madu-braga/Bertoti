import Composite.Forma;
import Leafs.Circulo;
import Leafs.Triangulo;

public class App {
    public static void main(String args[]) {
        Forma tri = new Triangulo();
        Forma tri1 = new Triangulo();
        Forma cir = new Circulo();

        Desenho desenho = new Desenho();
        desenho.adicionar(tri1);
        desenho.adicionar(tri);
        desenho.adicionar(cir);

        desenho.desenho("Amarelo");

        desenho.limpar();

        desenho.adicionar(tri1);
        desenho.adicionar(cir);
        desenho.desenho("Verde");

        desenho.remover(cir);
    }
}

