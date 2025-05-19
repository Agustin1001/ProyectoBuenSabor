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
}
