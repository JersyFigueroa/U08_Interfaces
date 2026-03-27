package A03;

public class NotificacionEmail implements Notificable {

    @Override
    public void enviarNotificacion(String mensaje) {
        System.out.println("Email enviado: " + mensaje);
    }
}
