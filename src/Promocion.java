import java.time.LocalDate;
import java.time.LocalTime;
import java.util.HashSet;
import java.util.Set;

public class Promocion {
    private String denominacion;
    private LocalDate fechaDesde;
    private LocalDate fechaHasta;
    private LocalTime horaDesde;
    private LocalTime horaHasta;
    private String descripcionDescuento;
    private Double precioPromocional;
    private TipoPromocion tipoPromocion;
    private Set<Imagen> imagenes;
    private Set<Articulo>articulos;

// Constructores

    public Promocion() {

    }

    public Promocion(String denominacion, LocalDate fechaDesde, LocalDate fechaHasta, LocalTime horaDesde, LocalTime horaHasta, String descripcionDescuento, Double precioPromocional, TipoPromocion tipoPromocion) {
        this.denominacion = denominacion;
        this.fechaDesde = fechaDesde;
        this.fechaHasta = fechaHasta;
        this.horaDesde = horaDesde;
        this.horaHasta = horaHasta;
        this.descripcionDescuento = descripcionDescuento;
        this.precioPromocional = precioPromocional;
        this.tipoPromocion = tipoPromocion;
        imagenes = new HashSet<>();
        articulos = new HashSet<>();
    }

// Metodos

    public void aniadirArticulo(Articulo articulo){
        if (articulos==null){
            this.articulos=new HashSet<>();
        }
        articulos.add(articulo);
    }

// Getters y Setters


    public String getDenominacion() {
        return denominacion;
    }

    public void setDenominacion(String denominacion) {
        this.denominacion = denominacion;
    }

    public LocalDate getFechaDesde() {
        return fechaDesde;
    }

    public void setFechaDesde(LocalDate fechaDesde) {
        this.fechaDesde = fechaDesde;
    }

    public LocalDate getFechaHasta() {
        return fechaHasta;
    }

    public void setFechaHasta(LocalDate fechaHasta) {
        this.fechaHasta = fechaHasta;
    }

    public LocalTime getHoraDesde() {
        return horaDesde;
    }

    public void setHoraDesde(LocalTime horaDesde) {
        this.horaDesde = horaDesde;
    }

    public LocalTime getHoraHasta() {
        return horaHasta;
    }

    public void setHoraHasta(LocalTime horaHasta) {
        this.horaHasta = horaHasta;
    }

    public String getDescripcionDescuento() {
        return descripcionDescuento;
    }

    public void setDescripcionDescuento(String descripcionDescuento) {
        this.descripcionDescuento = descripcionDescuento;
    }

    public Double getPrecioPromocional() {
        return precioPromocional;
    }

    public void setPrecioPromocional(Double precioPromocional) {this.precioPromocional = precioPromocional;
    }

    public TipoPromocion getTipoPromocion() {return tipoPromocion;}

    public void setTipoPromocion(TipoPromocion tipoPromocion) {this.tipoPromocion = tipoPromocion;}

    public void agregarImagen (Imagen imagen){
        if (imagenes==null){
            imagenes=new HashSet<>();
        }
        imagenes.add(imagen);
    }

    public void eliminarImagen(Imagen imagen) {
        if (imagenes!=null){
            imagenes.remove(imagen);
        }
    }

    public void agregarArticulo(Articulo articulo) {

        if (articulos==null){
            articulos=new HashSet<>();
        }
            articulos.add(articulo);
    }


    public void eliminarArticulo (Articulo articulo) {
        if (articulos !=null){
            articulos.remove(articulo);
        }
    }

    @Override
    public String toString() {
        return " denominacion='" + denominacion + ", fechaDesde=" + fechaDesde + ", fechaHasta=" + fechaHasta + ", horaDesde=" + horaDesde + ", horaHasta=" + horaHasta + ", descripcion='" + descripcionDescuento + ", precioPromocional=" + precioPromocional + ", tipoPromocion=" + tipoPromocion + "\n" +
                "   Imagenes=" + imagenes + "\n" +
                "   ListaArticulos=" + articulos;
    }
}
