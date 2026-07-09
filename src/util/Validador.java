package util;


public class Validador {
/**
     * Valida que un nombre contenga solamente letras y espacios.
     *
     * @param nombre Nombre a validar.
     * @return true si es válido, false en caso contrario.
     */
    public static boolean validarNombre(String nombre) {

        return nombre.matches("[a-zA-ZáéíóúÁÉÍÓÚñÑ ]+");

    }
    
    //valida el rut
    public static boolean validarRut(String rut){

    return rut.matches("[0-9kK.-]+");

}
}
