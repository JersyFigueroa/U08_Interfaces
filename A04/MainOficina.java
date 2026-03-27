package A04;

public class MainOficina {
    public static void main(String[] args) {

        ImpresoraBasica basica = new ImpresoraBasica();
        ImpresoraAvanzada avanzada = new ImpresoraAvanzada();

        basica.imprimir();

        avanzada.imprimir();
        avanzada.escanear();
    }
}
