package Model;

/**
 *
 * @author Mario
 */
public abstract class Persona {

    private String Cedula;
    private int Edad;
    private String Nombre;
    private String Apellido1;
    private String Apellido2;

    public Persona() {
    }

    public Persona(String pcedula, int pedad, String pnombre, String papellido1, String papellido2) {
        this.Cedula = pcedula;
        this.Edad = pedad;
        this.Nombre = pnombre;
        this.Apellido1 = papellido1;
        this.Apellido2 = papellido2;
    }

    public String getCedula() {
        return Cedula;
    }

    public void setCedula(String Cedula) {
        this.Cedula = Cedula;
    }
    
    public int getEdad() {
        return Edad;
    }

    public void setEdad(int Edad) {
        this.Edad = Edad;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getApellido1() {
        return Apellido1;
    }

    public void setApellido1(String Apellido1) {
        this.Apellido1 = Apellido1;
    }

    public String getApellido2() {
        return Apellido2;
    }

    public void setApellido2(String Apellido2) {
        this.Apellido2 = Apellido2;
    }

}
