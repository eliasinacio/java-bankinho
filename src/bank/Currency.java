package bank;

abstract public class Currency {
	public double value = 0;
	
	abstract public void info();

	abstract public double convert();
}
