public class DetallePedido {
    private int cantidad;
    private double subTotal;
    private Articulo articulo;

    public DetallePedido() {
    }

    public DetallePedido(int cantidad, double subTotal, Articulo articulo) {
        this.cantidad = cantidad;
        this.subTotal = subTotal;
        this.articulo = articulo;
    }


    @Override
    public String toString() {
        return "[ " + cantidad + " " + articulo.denominacion + ", subTotal=" + subTotal + " ]";
    }
}
