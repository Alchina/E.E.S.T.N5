package modelo;

public class Caja_de_Ahorro extends Cuenta_Bancaria {
	
	private static final int MAX_EXTRACCIONES_MENSUALES = 5;
    private int extraccionesRealizadas;

	
public Caja_de_Ahorro(String titular) {
	super(titular);
	this.extraccionesRealizadas = 0;
}

@Override
public boolean extraer(double monto) {
	boolean res = false;
    if (extraccionesRealizadas >= MAX_EXTRACCIONES_MENSUALES || monto > saldo) {
        res = false;
    }
    saldo -= monto;
    extraccionesRealizadas++;
    res = true;
    
    return res;
}

@Override
public String toString() {
	return "Caja_de_Ahorro [extraccionesRealizadas=" + extraccionesRealizadas + "]";
}

}