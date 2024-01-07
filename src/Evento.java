public class Evento {
    //ATRIBUTOS
    private String nombre;
    private boolean invitado;
    private Sala sala;
    private String fecha;
    private String hora;
    private double precio;
    private String tipo;
    private int max_asistentes;

    //GETTER Y SETTER

    public String getNombre() {
        return nombre;
    }

    public boolean isInvitado() {
        return invitado;
    }

    public Sala getSala() {
        return sala;
    }

    public String getFecha() {
        return fecha;
    }

    public String getHora() {
        return hora;
    }

    public double getPrecio() {
        return precio;
    }

    public String getTipo() {
        return tipo;
    }

    public int getMax_asistentes() {
        return max_asistentes;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setInvitado(boolean invitado) {
        this.invitado = invitado;
    }

    public void setSala(Sala sala) {
        this.sala = sala;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setMax_asistentes(int max_asistentes) {
        this.max_asistentes = max_asistentes;
    }
}
