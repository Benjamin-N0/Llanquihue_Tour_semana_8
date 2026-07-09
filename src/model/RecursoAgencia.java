package model;
/**
 * Clase base que representa un recurso perteneciente a la agencia.
 * Contiene información común para las entidades del sistema.
 */
public class RecursoAgencia {
    private String nombre;
    private String rut;

    //Constructor
    public RecursoAgencia(String nombre, String rut) {
        this.nombre = nombre;
        this.rut = rut;
    }

    //Getter y Setter
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRut() {
        return rut;
    }

    public void setRut(String rut) {
        this.rut = rut;
    }
    
    public String mostrarResumen() {
        return "Nombre: " + nombre + "\n"
                + "Rut: " + rut + "\n";
    }

    
}
