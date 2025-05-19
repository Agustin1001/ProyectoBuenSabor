public class ArticuloInsumo extends Articulo {
    private double precioCompra;
    private int stockActual;
    private int stockMaximo;
    private boolean esParaElaborar;

    public ArticuloInsumo() {}

    public ArticuloInsumo(String denominacion, double precioVenta, double precioCompre, int stockActual, int stockMaximo, boolean esParaElaborar) {
        super(denominacion, precioVenta);
        this.precioCompra = precioCompre;
        this.stockActual = stockActual;
        this.stockMaximo = stockMaximo;
        this.esParaElaborar = esParaElaborar;
    }

    @Override
    public String toString() {
        return denominacion + "," + unidadMedida + ", precioCompra=" + precioCompra + ", precioVenta=" + precioVenta + ", stockActual=" + stockActual + ", stockMaximo=" + stockMaximo + ", esParaElaborar=" + esParaElaborar + "]";
    }
}
