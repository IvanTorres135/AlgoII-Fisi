package pe.unmsm.arbol_genealogico;

public class Persona {
    String nombre,ape_pat,ape_mat,sex,padre_nom,padre_ape_mat,madre_nom,madre_ape_mat;
    int edad;
    
    public Persona(){
    }
    
    public Persona(String nom,String ape_pat,String ape_mat,int edad,String sex,String padre_nom,String padre_ape_mat,String madre_nom,String madre_ape_mat){
        this.nombre=nom;
        this.ape_pat=ape_pat;
        this.ape_mat=ape_mat;
        this.edad=edad;
        this.sex=sex;
        this.padre_nom=padre_nom;
        this.padre_ape_mat=padre_ape_mat;
        this.madre_nom=madre_nom;
        this.madre_ape_mat=madre_ape_mat;
    }
    
    public void setNombre(String nom){
        this.nombre=nom;
    }
    
    public void setApePat(String ape_pat){
        this.ape_pat=ape_pat;
    }
    
    public void setApeMat(String ape_mat){
        this.ape_mat=ape_mat;
    }
    
    public void setEdad(int edad){
        this.edad=edad;
    }
    
    public void setSex(String sex){
        this.sex=sex;
    }
    
    public void setNomPadre(String nom_padre){
        this.padre_nom=nom_padre;
    }
    
    public void setApeMatPadre(String padre_ape_mat){
        this.padre_ape_mat=padre_ape_mat;
    }
    
    public void setNomMadre(String nom_madre){
        this.madre_nom=nom_madre;
    }
    
    public void setApeMatMad(String madre_ape_mat){
        this.madre_ape_mat=madre_ape_mat;
    }
    
    public String getNombre(){
        return nombre;
    }
    
    public String getApePat(){
        return ape_pat;
    }
    
    public String getApeMat(){
        return ape_mat;
    }
    
    public int getEdad(){
        return edad;
    }
    public String getsex(){
        return sex;
    }
    
    public String getNomPadre(){
        return padre_nom;
    }
    
    public String getApeMatPadre(){
        return padre_ape_mat;
    }
    
    public String getNomMadre(){
        return madre_nom;
    }
    
    public String getApeMatMad(){
        return madre_ape_mat;
    }
}
