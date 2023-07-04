package modelo;

public abstract class Cuenta_Bancaria {
	protected String titular;
	protected double saldo;
	

    public Cuenta_Bancaria(String titular) {
        this.titular = titular;
        this.saldo = 0;
    }

    public double getSaldo() {
        return saldo;
    }

    public void depositar(double monto) {
        saldo += monto;
    }

  
    public abstract boolean extraer(double monto);

	@Override
	public String toString() {
		return "CuentaBancaria [titular=" + titular + ", saldo=" + saldo + "]";
	}
}

	