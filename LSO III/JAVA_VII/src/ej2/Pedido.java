package ej2;

public class Pedido {
    private Camisa camisaElegida;
    private int cantidadDeCamisas;
    private double precioTotal;

    public void setCamisaElegida(Camisa camisa) {
        camisaElegida = camisa;
        calcularTotal();
    }

    public Camisa getCamisaElegida() {
        return camisaElegida;
    }

    public void setCantidadDeCamisas(int cantidad) {
        cantidadDeCamisas = cantidad;
        calcularTotal();
    }

    public int getCantidadDeCamisas() {
        return cantidadDeCamisas;
    }

    public double getPrecioTotal() {
        return precioTotal;
    }

    private void calcularTotal() {
        if (camisaElegida != null) {
            precioTotal = camisaElegida.getPrecioUnitario() * cantidadDeCamisas;
        }
    }
}
