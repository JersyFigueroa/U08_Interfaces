package U08_Interfaces;

public class Main {
    public static void main(String[] args) {

        DispositivoConectado bombilla = new Bombilla();
        DispositivoConectado televisor = new Televisor();

        bombilla.encender();
        bombilla.conectar("WiFi", "10:00");
        bombilla.mostrarInfoGeneral();
        bombilla.apagar();

        System.out.println("------------------");

        televisor.encender();
        televisor.conectar("WiFi", "12:00");
        televisor.mostrarInfoGeneral();
        televisor.apagar();
    }
}
