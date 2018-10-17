public class horario extends General {

    /**
     * @return the horarios
     */
    public String getHorarios() {
        return horarios;
    }

    /**
     * @param horarios the horarios to set
     */
    public void setHorarios(String horarios) {
        this.horarios = horarios;
    }

    /**
     * @return the ciudades
     */
    public String getCiudades() {
        return ciudades;
    }

    /**
     * @param ciudades the ciudades to set
     */
    public void setCiudades(String ciudades) {
        this.ciudades = ciudades;
    }
  public horario (int folio,String destino,String aereolinea, String fecha, String tipo, String categoriaA,String horarios,String ciudades){
  super(folio,destino,aereolinea,fecha,tipo,categoriaA);
  this.horarios=horarios;
  this.ciudades=ciudades;
  }
    private String horarios;

    private String ciudades;
}
