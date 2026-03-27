package A03;

public class NotificacionSMS implements Notificable {

    @Override
    public void enviarNotificacion(String mensaje) {
        System.out.println("SMS enviado: " + mensaje);
    }
}
