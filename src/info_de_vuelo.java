public class info_de_vuelo extends tarifas {

    

    /**
     * @return the asientos
     */
    public int getAsientos() {
        return asientos;
    }

    /**
     * @param asientos the asientos to set
     */
    public void setAsientos(int asientos) {
        this.asientos = asientos;
    }
 public info_de_vuelo(int folio,String destino,String aereolinea, String fecha, String tipo, String categoriaA,String horarios,String ciudades,double precio,int asientos){
       super(folio,destino,aereolinea,fecha,tipo,categoriaA,horarios,ciudades,precio);
        this.asientos=asientos;
        
        
    }
    private int asientos;

   
}
