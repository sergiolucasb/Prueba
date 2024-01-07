public class Butaca {
    //ATRIBUTOS
    private String id;
    private boolean accesibilidad;
    private boolean disponible;

    //CONSTRUCTORES
    Butaca(){}
    Butaca(String id, boolean accesibilidad, boolean disponible) {
        this.id = id;
        this.accesibilidad = accesibilidad;
        this.disponible = disponible;
    }
}
