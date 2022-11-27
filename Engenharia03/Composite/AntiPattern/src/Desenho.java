import java.util.ArrayList;
import java.util.List;

public class Desenho {
    private List<Triangulo> triangulos = new ArrayList<Triangulo>();
    private List<Circulo> circulos = new ArrayList<Circulo>();

    public void adicionarTriangulo(Triangulo triangulo){
        this.triangulos.add(triangulo);    
    }

    public void adicionarCirculo(Circulo circulo){
        this.circulos.add(circulo);  
    }
}

