package Model;

public class Pacientes extends Persona {

    private String Expediente;

    public Pacientes() {
        super();
        this.Expediente = "";
    }

    public Pacientes(String pcedula, int pedad, String pnombre, String papellido1, String papellido2) {
        super(pcedula, pedad, pnombre, papellido1, papellido2);
    }

    public String getExpediente() {
        return Expediente;
    }

    public void setExpediente(String Expediente) {
        this.Expediente = Expediente;
    }

}
