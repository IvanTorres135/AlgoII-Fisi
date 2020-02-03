package pe.unmsm.prestamo_libro;

public class Libro {
    String Cod_libro;
    String Nom_libro;
    
    public Libro(){    
    }
    
    public Libro(String cod,String nom){
        this.Cod_libro=cod;
        this.Nom_libro=nom;
    }
    
    public void setCodigoLib(String cod){
        this.Cod_libro=cod;
    }
    
    public String getCodigoL(){
        return Cod_libro;
    }
    
    public void setNomLibro(String nom){
        this.Nom_libro=nom;
    }
    
    public String setNomLib(){
        return Nom_libro;
    }
}
