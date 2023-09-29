package ej3;

public class CuentaCorriente {
    private Persona titular;
    private int nroCuenta;
    private double saldo;

    public CuentaCorriente(Persona titular, int nroCuenta, double saldoInicial) {
        this.titular = titular;
        this.nroCuenta = nroCuenta;
        this.saldo = saldoInicial;
    }

    public CuentaCorriente(Persona titular, int nroCuenta) {
        this.titular = titular;
        this.nroCuenta = nroCuenta;
    }

    public Persona getTitular() {
        return titular;
    }

    public int getNroCuenta() {
        return nroCuenta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void depositar(double monto) {
        saldo += monto;
    }

    public void extraer(double monto) {
        if (saldo >= monto) {
            saldo -= monto;
        }
    }

    public void imprimirDatos() {
        System.out.println("Titular: " + titular.getNombre() + " " + titular.getApellido() + ", Edad: " + titular.getEdad());
        System.out.println("Número de cuenta: " + nroCuenta);
        System.out.println("Saldo: " + saldo);
    }

    public boolean compararCuenta(CuentaCorriente otraCuenta) {
        return this.nroCuenta == otraCuenta.getNroCuenta();
    }
}

