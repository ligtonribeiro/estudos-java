public class Controle {
    private int contador = 0;

    public Controle(int contador) {
        this.contador = contador;
    }

    public synchronized void decrementa() {
        this.contador = this.contador - 1;
    }

    public synchronized int getControle() {
        return this.contador;
    }
}
