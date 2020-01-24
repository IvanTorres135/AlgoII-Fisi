package pe.edu.unmsm.agenda;

public class Contacto {
     String Nombre;
    String Apellido;
    int edad;
    double salario;
           
    public Contacto(){
        
    }
    
    public Contacto(String Nombre, String Apellido,int edad, double salario){
    this.Nombre=Nombre;
    this.Apellido=Apellido;
    this.edad=edad;
    this.salario=salario;
    }
    
    public void setNombre(String nombre){
        this.Nombre=nombre;
    }
    
    public void setApellido(String apellido){
        this.Nombre=apellido;
    }
    
    public void setedad(int edad){
        this.edad=edad;
    }
    
    public void setsalario(double salario){
        this.salario=salario;
    }
    
    public String getNombre(){
        return Nombre;
    }
    
    public String getApellido(){
        return Apellido;
    }
    
    public int getedad(){
        return edad;
    }
    
    public double getsalario(){
        return salario;
    }
    
}
