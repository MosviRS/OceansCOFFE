public class General {

    /**
     * @return the folio
     */
    public int getFolio() {
        return folio;
    }

    /**
     * @param folio the folio to set
     */
    public void setFolio(int folio) {
        this.folio = folio;
    }

    /**
     * @return the destino
     */
    public String getDestino() {
        return destino;
    }

    /**
     * @param destino the destino to set
     */
    public void setDestino(String destino) {
        this.destino = destino;
    }

    /**
     * @return the aereolinea
     */
    public String getAereolinea() {
        return aereolinea;
    }

    /**
     * @param aereolinea the aereolinea to set
     */
    public void setAereolinea(String aereolinea) {
        this.aereolinea = aereolinea;
    }

    /**
     * @return the fecha
     */
    public String getFecha() {
        return fecha;
    }

    /**
     * @param fecha the fecha to set
     */
    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    /**
     * @return the tipo
     */
    public String getTipo() {
        return tipo;
    }

    /**
     * @param tipo the tipo to set
     */
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    /**
     * @return the categoriaA
     */
    public String getCategoriaA() {
        return categoriaA;
    }

    /**
     * @param categoriaA the categoriaA to set
     */
    public void setCategoriaA(String categoriaA) {
        this.categoriaA = categoriaA;
    }
    public General(int folio,String destino,String aereolinea, String fecha, String tipo, String categoriaA){
        this.folio=folio;
        this.destino=destino;
        this.aereolinea=aereolinea;
        this.fecha=fecha;
        this.tipo=tipo;
        this.categoriaA=categoriaA;
        
    }
    private int folio;

    private String destino;

    private String aereolinea;

    private String fecha;

    private String tipo;

    private String categoriaA;
}
