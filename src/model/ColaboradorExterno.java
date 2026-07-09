package model;
/**
 * Representa un colaborador externo de la agencia.
 */
public class ColaboradorExterno extends RecursoAgencia implements Registrable{
    private String servicioPrestado;
  
    //Constructor heredado de la clase RecursoAgencia
public ColaboradorExterno(String nombre, String rut, String servicioPrestado) {
        super(nombre, rut);
        this.servicioPrestado = servicioPrestado;
    }

//Getter y Setter
    public String getServicioPrestado() {
        return servicioPrestado;
    }

    public void setServicioPrestado(String servicioPrestado) {
        this.servicioPrestado = servicioPrestado;
    }
    
@Override
public String mostrarResumen(){
return "Nombre de Empresa: " + getNombre() + "\nRUT: " + getRut() + "\nTipo de Servicio: " + servicioPrestado ;

}
}
