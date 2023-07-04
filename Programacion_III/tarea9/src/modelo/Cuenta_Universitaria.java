package modelo;

public class Cuenta_Universitaria extends Cuenta_Bancaria {
	
	private double limite = 0;

	public Cuenta_Universitaria(String titular) {
		super(titular);
	}

	@Override
	public boolean extraer(double monto) {
	    boolean extraccionExitosa = false;
	    final double LIMITE_DIARIO = 1000;

	    if ((limite + monto <= LIMITE_DIARIO) && monto <= saldo) {
	        saldo -= monto;
	        limite += monto;
	        extraccionExitosa = true;
	    }

	    return extraccionExitosa;
	}

	@Override
	public String toString() {
		return "CuentaUniversitaria [limite=" + limite + "]";
	}
}
	
	

