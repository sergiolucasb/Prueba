public class Reserva {
    //ATRIBUTOS
    private String id;
    private Asistente asistente;
    private Evento evento;
    private Butaca butaca;
    private String fecha;
    private String hora;


    //GETTER Y SETTER

    public String getId() {
        return id;
    }

    public Asistente getAsistente() {
        return asistente;
    }

    public Evento getEvento() {
        return evento;
    }

    public Butaca getButaca() {
        return butaca;
    }

    public String getFecha() {
        return fecha;
    }

    public String getHora() {
        return hora;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setAsistente(Asistente asistente) {
        this.asistente = asistente;
    }

    public void setEvento(Evento evento) {
        this.evento = evento;
    }

    public void setButaca(Butaca butaca) {
        this.butaca = butaca;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }
}
