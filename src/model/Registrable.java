package model;
/**
 * Interfaz que define el comportamiento de las entidades
 * que pueden mostrar un resumen de su información.
 */
public interface Registrable {
    /**
     * Retorna un resumen con la información de la entidad.
     * @return Resumen de la entidad.
     */
    public String mostrarResumen();
}
