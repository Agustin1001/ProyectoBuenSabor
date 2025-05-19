import java.time.LocalDate;
import java.time.LocalTime;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Pedido {
    private LocalTime horaEstimadaFinalizacion;
    private Double total;
    private Double totalCosto;
    private Estado estado;
    private TipoEnvio tipoEnvio;
    private FormaPago formaPago;
    private LocalDate fechaPedido;
    private Sucursal sucursal;
    private Domicilio domicilio;
    private Set<DetallePedido> detallesPedido;
    private Factura factura;

    public Pedido() {
    }

    public Pedido(LocalTime horaEstimadaFinalizacion, Double total, Double totalCosto, Estado estado, TipoEnvio tipoEnvio,
                  FormaPago formaPago, LocalDate fechaPedido, Sucursal sucursal, Domicilio domicilio, Factura factura) {
        this.horaEstimadaFinalizacion = horaEstimadaFinalizacion;
        this.total = total;
        this.totalCosto = totalCosto;
        this.estado = estado;
        this.tipoEnvio = tipoEnvio;
        this.formaPago = formaPago;
        this.fechaPedido = fechaPedido;
        this.sucursal = sucursal;
        this.domicilio = domicilio;
        this.factura = factura;
        this.detallesPedido = new HashSet<>();
    }

    public void agregarDetalleAlPedido(DetallePedido detallePedido) {
        if(detallesPedido == null) {
            detallesPedido = new HashSet<>();
        }
        detallesPedido.add(detallePedido);
    }

    public void eliminarDetallePedido(DetallePedido detallePedido) {
        if(detallesPedido != null) {
        detallesPedido.remove(detallePedido);
        }
    }

    @Override
    public String toString() {
        return "Pedido [ " + "horaEstimadaFinalizacion=" + horaEstimadaFinalizacion + ", total=" + total + ", totalCosto=" + totalCosto + ", " + estado +
                "," + tipoEnvio + "," + formaPago + ", fechaPedido=" + fechaPedido +
                ", sucursal= " + sucursal.getNombre() + ", domicilio =" + domicilio + "]"
                + "\n" + ", detallesPedido=" + detallesPedido
                + "\n" + factura;
    }

}