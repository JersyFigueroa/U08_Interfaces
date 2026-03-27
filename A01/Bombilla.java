package A01;

public class Bombilla implements DispositivoConectado {

    @Override
    public void encender() {
        System.out.println("La bombilla se ha encendido 💡");
    }

    @Override
    public void apagar() {
        System.out.println("La bombilla se ha apagado ❌");
    }

    @Override
    public void conectar(String tipoRed, String hora) {
        System.out.println("Bombilla conectada a " + tipoRed + " a las " + hora);
    }

    @Override
    public void mostrarInfoGeneral() {
        System.out.println("Soy una bombilla inteligente.");
    }
}
