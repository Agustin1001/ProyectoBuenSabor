public class Imagen {
    private String denominacion;

    public Imagen() {
    }

    public Imagen(String denominacion) {
        this.denominacion = denominacion;
    }

    @Override
    public String toString() {
        return "[ denominacion=" + denominacion + "]";
    }
    public String getDenominacion() {
        return denominacion;
    }

    public void setDenominacion(String denominacion) {
        this.denominacion = denominacion;
    }
}
