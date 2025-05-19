public class UnidadMedida {
    private String denominacion;

    private UnidadMedida() {
    }

    public UnidadMedida(String denominacion) {
    }

    @Override
    public String toString() {
        return denominacion;
    }
}

