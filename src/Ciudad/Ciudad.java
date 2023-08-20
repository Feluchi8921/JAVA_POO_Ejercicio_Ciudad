package Ciudad;

public class Ciudad {
    //Atributos
    private String nombre;
    private int poblacion;
    private String pais;
    private String presidente;

    //Constructores
    public Ciudad(){
        this.nombre=nombre;
        this.poblacion=poblacion;
        this.pais=pais;
        this.presidente=presidente;
    }
    public Ciudad(String nombre, int poblacion, String pais, String presidente) {
        this.nombre = nombre;
        this.poblacion = poblacion;
        this.pais = pais;
        this.presidente = presidente;
    }

    //Metodos
    //Getters
    public String getNombre() {
        return nombre;
    }

    public int getPoblacion() {
        return poblacion;
    }

    public String getPais() {
        return pais;
    }

    public String getPresidente() {
        return presidente;
    }

    //Setters

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPoblacion(int poblacion) {
        this.poblacion = poblacion;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public void setPresidente(String presidente) {
        this.presidente = presidente;
    }


}
