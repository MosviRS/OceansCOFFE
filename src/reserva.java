public class reserva extends General {

    public reserva(int folio, String destino, String aereolinea, String fecha, String tipo, String categoriaA) {
        super(folio, destino, aereolinea, fecha, tipo, categoriaA);
    }

   
    
   

    
    /**
     * @return the numeroasientos
     */
    public int getNumeroasientos() {
        return numeroasientos;
    }

    /**
     * @param numeroasientos the numeroasientos to set
     */
    public void setNumeroasientos(int numeroasientos) {
        this.numeroasientos = numeroasientos;
    }

    private int numeroasientos;
}
