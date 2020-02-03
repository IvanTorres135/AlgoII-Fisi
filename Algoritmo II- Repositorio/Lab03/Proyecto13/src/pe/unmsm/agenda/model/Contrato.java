package pe.unmsm.agenda.model;
import java.io.Serializable;
public class Contrato implements Serializable{
    private static final long serialVersionUID = 1L;
    private String nombre;
    private String telefono;
    private String detalles;
    
    public Contrato(){
        nombre = "Nuevo Contrato";
        telefono = "";
        detalles = "";
    }
    
    public String getNome() {
        return nombre;
    }

    public void setNome(String nom) {
        this.nombre = nom;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telf) {
        this.telefono = telf;
    }

    public String getDetalles() {
        return detalles;
    }

    public void setDetalles(String detalles) {
        this.detalles = detalles;
    }

    @Override
    public String toString() {
        return nombre;
    }    

}
