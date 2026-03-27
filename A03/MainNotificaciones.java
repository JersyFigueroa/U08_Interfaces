package A03;

public class MainNotificaciones {
    public static void main(String[] args) {

        Notificable[] canales = {
            new NotificacionEmail(),
            new NotificacionSMS(),
            new NotificacionPush()
        };

        String mensaje = "Mantenimiento urgente del servidor";

        for (Notificable canal : canales) {
            canal.enviarNotificacion(mensaje);
        }
    }
}
