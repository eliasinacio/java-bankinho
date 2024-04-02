package bank;

public class Real extends Currency {
    public Real (double valor) {
        this.value = valor;
    }

    @Override
    public void info() {
        System.out.printf("R$ %.2f reais\n", this.value);
    }

    @Override
    public double convert() {
        return this.value;
    }
}
