package texto;

public class Titulo implements Texto{

    @Override
    public void escrever() {
        System.out.println("Este é um título");
        System.out.println("\n");
    }
    
}
