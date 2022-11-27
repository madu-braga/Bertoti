import Observer.NotificarEmail;
import Observer.NotificarSMS;

public class App {
    public static void main(String[] args) throws Exception {
        Controlador controle = new Controlador();

        controle.addObserver(new NotificarEmail());
        controle.addObserver(new NotificarSMS());
        controle.notificar();

    }
}
