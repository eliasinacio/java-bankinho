package bank;

public class Euro extends Currency {
    public Euro (double valor) {
        this.value = valor;
    }

    @Override
    public void info() {
        System.out.printf("€  %.2f euros\n", this.value);
    }

    @Override
    public double convert() {
        return value * 5.40;
    }
}