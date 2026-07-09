package model;

/**
 * Representa un guía turístico de la agencia.
 * Hereda de RecursoAgencia e implementa Registrable.
 */
public class GuiaTuristico extends RecursoAgencia implements Registrable {
    
    private String idioma;
    
    //Constructor heredado de la clase RecursoAgencia
public GuiaTuristico(String nombre, String rut, String idioma) {
        super(nombre, rut);
        this.idioma = idioma;
    }

//Getter y Setter
    public String getIdioma() {
        return idioma;
    }

    public void setIdioma(String idioma) {
        this.idioma = idioma;
    }


@Override
public String mostrarResumen(){
return "Guia: " + getNombre() + "\nRUT: " + getRut() + "\nIdioma: " + idioma ;

}
}
