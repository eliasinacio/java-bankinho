package bank;

public class Dollar extends Currency {
    public Dollar (double valor) {
        this.value = valor;
    }

    @Override
    public void info() {
        System.out.println("$ " + this.value + " dollars");
    }

    @Override
    public double convert() {
        return value * 4.99;
    }
}