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

    //MÉTODOS
    @Override
    public String toString() {
        return "Butaca{" +
                "id='" + id + '\'' +
                ", accesibilidad=" + accesibilidad +
                ", disponible=" + disponible +
                '}';
    }
    public void ocuparButaca(){
        if (this.disponible){
            this.disponible = false;
            System.out.println("Butaca ocupada");
        }
    }

    public void desocuparButaca(){
        this.disponible = true;
        System.out.println("Butaca desocupada");
    }
}
