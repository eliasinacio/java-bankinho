package bank;

public class Dollar extends Currency {
    public Dollar (double valor) {
        this.value = valor;
    }

    @Override
    public void info() {
        System.out.printf("$  %.2f dollars\n", this.value);
    }

    @Override
    public double convert() {
        return value * 4.99;
    }
}