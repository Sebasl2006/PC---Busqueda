package controllers;
import models.Person;
import views.ShowConsole;
public class MetodosBusqueda {

    private ShowConsole showConsole;
    private Person[] people;

    

    public MetodosBusqueda(Person[] people) {
        showConsole = new ShowConsole();
        this.people = people;
    }

    public int busquedaLineal (int[] arreglo, int busqueda){
        for (int i = 0; i < arreglo.length; i++) if ( arreglo[i] == busqueda) return i;
        return -1;
    }

    

    /**
     * @param code a buscar
     * @return posicion de la persona encontrada
     */

    public int findPersonByCode(int code){
        for (int i = 0; i < people.length; i++) if (people[i].getCode()==code) return i;
        return -1;
    }
}
