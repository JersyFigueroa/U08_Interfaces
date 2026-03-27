package U08_Interfaces;

public interface DispositivoConectado {
    String TIPO_RED = "WiFi";

    void encender();
    void apagar();
    void conectar(String tipoRed, String hora);
    void mostrarInfoGeneral();
}
