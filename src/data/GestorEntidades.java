package data;
import java.util.ArrayList;
import model.ColaboradorExterno;
import model.GuiaTuristico;
import model.Registrable;
import model.Vehiculo;

/**
 *Administra las entidades registradas en el sistema
 *Permite Agregar y mostrar las entidades
 *
 */
public class GestorEntidades {
    private ArrayList<Registrable> entidades;
    

    public GestorEntidades() {
        entidades = new ArrayList<>();
    }

//Agrega una entidad a la lista
    public void agregarEntidad(Registrable entidad) {
        entidades.add(entidad);
    }

public String mostrarEntidades() {
        
    if (entidades.isEmpty()) {
            return "No hay datos registrados.";
        }
    String resumen = "";

    for (Registrable entidad : entidades) {

        if (entidad instanceof GuiaTuristico) {

            resumen += "---- GUÍA TURÍSTICO ----\n";

        } else if (entidad instanceof Vehiculo) {

            resumen += "---- VEHÍCULO ----\n";

        } else if (entidad instanceof ColaboradorExterno) {

            resumen += "---- COLABORADOR EXTERNO ----\n";

        }

        resumen += entidad.mostrarResumen();
        resumen += "\n\n";
    }

    return resumen;
}



}
