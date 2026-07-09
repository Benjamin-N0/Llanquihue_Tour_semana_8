package model;
/**
 * Representa un vehículo utilizado por la agencia.
 */
public class Vehiculo extends RecursoAgencia implements Registrable{
    private String patente;
    
    //Constructor heredado de la clase RecursoAgencia
public Vehiculo(String nombre, String rut, String patente) {
        super(nombre, rut);
        this.patente = patente;
    }

//Getter y Setter
    public String getPatente() {
        return patente;
    }

    public void setPatente(String patente) {
        this.patente = patente;
    }
    
@Override
public String mostrarResumen(){
return "TIPO DE VEHICULO: " + getNombre() + "\nRUT PROPIETARIO: " + getRut() + "\nPatente: " + patente ;

}
}
