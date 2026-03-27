package A03;

public class NotificacionPush implements Notificable {

    @Override
    public void enviarNotificacion(String mensaje) {
        System.out.println("Notificación PUSH enviada: " + mensaje);
    }
}
