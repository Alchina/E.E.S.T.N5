package modelo;

public class Cuenta_Corriente extends Cuenta_Bancaria {
	private double topeDescubierto;

    public Cuenta_Corriente(String titular, double topeDescubierto) {
        super(titular);
        this.topeDescubierto = topeDescubierto;
    }

    @Override
    public boolean extraer(double monto) {
    	boolean res = false;
        if (monto <= saldo + topeDescubierto) {
            saldo -= monto;
            res = true;
        }
       return res;
    }
    
    @Override
	public String toString() {
		return "CuentaCorriente [topeDescubierto=" + topeDescubierto + "]";
	}    
}