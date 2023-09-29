package ej2;

public class Camisa {
    private double precioUnitario;
    private char color;
    private int talle;

    public void setPrecioUnitario(double precio) {
        precioUnitario = precio;
    }

    public double getPrecioUnitario() {
        return precioUnitario;
    }

    public void setColor(char c) {
        color = c;
    }

    public char getColor() {
        return color;
    }

    public void setTalle(int t) {
        talle = t;
    }

    public int getTalle() {
        return talle;
    }
}