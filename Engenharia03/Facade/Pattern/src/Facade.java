import forma.Circulo;
import forma.Forma;
import forma.Quadrado;
import forma.Retangulo;
import texto.Paragrafo;
import texto.Texto;
import texto.Titulo;

public class Facade {
    private Forma circulo;
    private Forma quadrado;
    private Forma retangulo;

    private Texto titulo;
    private Texto paragrafo;

    public Facade(){
        this.circulo = new Circulo();
        this.quadrado = new Quadrado();
        this.retangulo = new Retangulo();

        this.titulo = new Titulo();
        this.paragrafo = new Paragrafo();
    }

    public void desenharCirculo(){
        this.circulo.desenhar();
    }

    public void desenharQuadrado(){
        this.quadrado.desenhar();
    }

    public void desenharRetangulo(){
        this.retangulo.desenhar();
    }

    public void escreverTitulo(){
        this.titulo.escrever();
    }

    public void escreverParagrafo(){
        this.paragrafo.escrever();
    }

}
