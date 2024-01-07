public class Sala {
    //ATRIBUTOS
    private String nombre;
    private int capacidad_maxima;
    private String lista_butacas;
    private double dimension;
    private boolean accesibilidad;
    private String caracteristicas_acusticas;
    private String observaciones;

    //GETTER Y SETTER
    public String getNombre() {
        return nombre;
    }

    public int getCapacidad_maxima() {
        return capacidad_maxima;
    }

    public String getLista_butacas() {
        return lista_butacas;
    }

    public double getDimension() {
        return dimension;
    }

    public boolean isAccesibilidad() {
        return accesibilidad;
    }

    public String getCaracteristicas_acusticas() {
        return caracteristicas_acusticas;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setCapacidad_maxima(int capacidad_maxima) {
        this.capacidad_maxima = capacidad_maxima;
    }

    public void setLista_butacas(String lista_butacas) {
        this.lista_butacas = lista_butacas;
    }

    public void setDimension(double dimension) {
        this.dimension = dimension;
    }

    public void setAccesibilidad(boolean accesibilidad) {
        this.accesibilidad = accesibilidad;
    }

    public void setCaracteristicas_acusticas(String caracteristicas_acusticas) {
        this.caracteristicas_acusticas = caracteristicas_acusticas;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

    //MÉTODOS
    public boolean comprobarCapacidad(int asistentes){
        if (asistentes > this.capacidad_maxima){
            return false;
        }
        return true;
    }
}
