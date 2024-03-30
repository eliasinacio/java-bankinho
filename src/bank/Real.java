package bank;

public class Real extends Currency {
    public Real (double valor) {
        this.value = valor;
    }

    @Override
    public void info() {
        System.out.println("R$ " + this.value + "real(s)");
    }

    @Override
    public double convert() {
        return this.value;
    }
}
