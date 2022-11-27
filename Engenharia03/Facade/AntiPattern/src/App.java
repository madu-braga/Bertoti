import forma.Circulo;
import forma.Forma;
import forma.Quadrado;
import forma.Retangulo;
import texto.Paragrafo;
import texto.Texto;
import texto.Titulo;

public class App {
    public static void main(String[] args) throws Exception {
        Forma quadrado = new Quadrado();
        Forma circulo = new Circulo();
        Forma retangulo = new Retangulo();

        Texto titulo = new Titulo();
        Texto paragrafo = new Paragrafo();

        titulo.escrever();
        quadrado.desenhar();
        paragrafo.escrever();
        circulo.desenhar();
        retangulo.desenhar();
    }
}
