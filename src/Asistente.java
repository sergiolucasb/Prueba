public class Asistente {
    //ATRIBUTOS
    private String nombre;
    private String apellidos;
    private String email;
    private String telefono;
    private String dni;
    private String fecha_nacimiento;

    //CONSTRUCTORES
    Asistente(){}
    Asistente(String nombre, String apellidos, String email, String telefono, String dni, String fecha_nacimiento){
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.email = email;
        this.telefono = telefono;
        this.dni = dni;
        this.fecha_nacimiento = fecha_nacimiento;
    }
    Asistente(String nombre, String apellidos, String email) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.email = email;
    }

    
}
