import java.time.LocalDate;

public class Factura {
    private LocalDate fechaFacturacion;
    private Integer mpPaymentId;
    private Integer mpMerchantOrderId;
    private String mpPreferenceId;
    private String mpPaymentType;
    private FormaPago formaPago;
    private Double totalVenta;

    public Factura() {
    }
    public Factura(LocalDate fechaFacturacion, Integer mpPaymentId, Integer mpMerchantOrderId, String mpPreferenceId,
                   String mpPaymentType, FormaPago formaPago, Double totalVenta) {
        this.fechaFacturacion = fechaFacturacion;
        this.mpPaymentId = mpPaymentId;
        this.mpMerchantOrderId = mpMerchantOrderId;
        this.mpPreferenceId = mpPreferenceId;
        this.mpPaymentType = mpPaymentType;
        this.formaPago = formaPago;
        this.totalVenta = totalVenta;
    }

    @Override
    public String toString() {
        return "Factura " + "\n" +
                "  fechaFacturacion=" + fechaFacturacion + "\n" +
                "  mpPaymentId=" + mpPaymentId + "\n" +
                "  mpMerchantOrderId=" + mpMerchantOrderId + "\n" +
                "  mpPreferenceId='" + mpPreferenceId + "\n" +
                "  mpPaymentType='" + mpPaymentType + "\n" +
                "  formaPago=" + formaPago + "\n" +
                "  totalVenta=" + totalVenta + "\n";
    }

    public LocalDate getFechaFacturacion() {return fechaFacturacion;}

    public void setFechaFacturacion(LocalDate fechaFacturacion) {this.fechaFacturacion = fechaFacturacion;}

    public int getMpPaymetid() {return mpPaymetid;}

    public void setMpPaymetid(int mpPaymetid) {this.mpPaymetid = mpPaymetid;}

    public int getMpMechantOrderId() {return mpMechantOrderId;}

    public void setMpMechantOrderId(int mpMechantOrderId) {this.mpMechantOrderId = mpMechantOrderId;}

    public String getMpPreferenceId() {return mpPreferenceId;}

    public void setMpPreferenceId(String mpPreferenceId) {this.mpPreferenceId = mpPreferenceId;}

    public String getMpPaymenType() {return mpPaymenType;}

    public void setMpPaymenType(String mpPaymenType) {this.mpPaymenType = mpPaymenType;}

    public FormaPago getFormaPago() {return formaPago;}

    public void setFormaPago(FormaPago formaPago) {this.formaPago = formaPago;}

    public double getTotalVenta() {return totalVenta;}

    public void setTotalVenta(double totalVenta) {this.totalVenta = totalVenta;}

}
