import java.util.ArrayList;
import java.util.List;

import Composite.Forma;

public class Desenho implements Forma{
    private List<Forma> formas = new ArrayList<Forma>();

    @Override
    public void desenho(String corDesenho) {
        for(Forma forma : formas){
            forma.desenho(corDesenho);
        }
    }

    public void adicionar(Forma f){
        this.formas.add(f);
    }

    public void remover(Forma f){
        formas.remove(f);
    }

    public void limpar(){
        System.out.println("Limpando todas as formas.");
        this.formas.clear();
    }
}
