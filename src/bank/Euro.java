package bank;

public class Euro extends Currency {
    public Euro (double valor) {
        this.value = valor;
    }

    @Override
    public void info() {
        System.out.println("€ " + this.value + " euro(s)");
    }

    @Override
    public double convert() {
        return value * 5.40;
    }
}