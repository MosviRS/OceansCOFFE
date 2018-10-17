public class tarifas extends horario {

    /**
     * @return the precio
     */
    public double getPrecio() {
        return precio;
    }

    /**
     * @param precio the precio to set
     */
    public void setPrecio(double precio) {
        this.precio = precio;
    }
    public tarifas(int folio,String destino,String aereolinea, String fecha, String tipo, String categoriaA,String horarios,String ciudades,double precio){
        super(folio,destino,aereolinea,fecha,tipo,categoriaA,horarios,ciudades);
        
        this.precio=precio;
  
    }
   public void comparar(){
       if (getPrecio() > precio) {
                
            }
            if (getPrecio() < precio) {
               
            }
            
        }
   
    private double precio;
   }


