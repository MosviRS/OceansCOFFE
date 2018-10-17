public class compra extends General {

    /**
     * @return the billetes
     */
    public int getBilletes() {
        return billetes;
    }

    /**
     * @param billetes the billetes to set
     */
    public void setBilletes(int billetes) {
        this.billetes = billetes;
    }

    public compra(int folio, String destino, String aereolinea, String fecha, String tipo, String categoriaA) {
        super(folio, destino, aereolinea, fecha, tipo, categoriaA);
    }

    /**
     * @return the tarjeta
     */
    public String getTarjeta() {
        return tarjeta;
    }

    /**
     * @param tarjeta the tarjeta to set
     */
    public void setTarjeta(String tarjeta) {
        this.tarjeta = tarjeta;
    }
    private int billetes;
    private String tarjeta;
}
