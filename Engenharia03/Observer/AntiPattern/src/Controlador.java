public class Controlador {
    
    private NotificarEmail email = new NotificarEmail();
    private NotificarSMS sms = new NotificarSMS();

    public void notificador(){
        email.enviarEmail();
        sms.enviarSMS();
    }

}
