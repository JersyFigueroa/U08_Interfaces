package A01;

public class Televisor implements DispositivoConectado {

    @Override
    public void encender() {
        System.out.println("El televisor se ha encendido 📺");
    }

    @Override
    public void apagar() {
        System.out.println("El televisor se ha apagado ❌");
    }

    @Override
    public void conectar(String tipoRed, String hora) {
        System.out.println("Televisor conectado a " + tipoRed + " a las " + hora +
                " buscando actualizaciones de firmware...");
    }

    @Override
    public void mostrarInfoGeneral() {
        System.out.println("Soy un televisor inteligente.");
    }
}
