package ej2;

public class TestPedido {
    public static void main(String[] args) {
        Camisa camisa1 = new Camisa();
        camisa1.setPrecioUnitario(25.0);
        camisa1.setColor('B');
        camisa1.setTalle(3);

        Camisa camisa2 = new Camisa();
        camisa2.setPrecioUnitario(30.0);
        camisa2.setColor('R');
        camisa2.setTalle(2);

        Pedido pedido1 = new Pedido();
        pedido1.setCamisaElegida(camisa1);
        pedido1.setCantidadDeCamisas(3);

        Pedido pedido2 = new Pedido();
        pedido2.setCamisaElegida(camisa2);
        pedido2.setCantidadDeCamisas(2);

        System.out.println("Precio total del pedido 1: " + pedido1.getPrecioTotal());
        System.out.println("Precio total del pedido 2: " + pedido2.getPrecioTotal());
    }
}
