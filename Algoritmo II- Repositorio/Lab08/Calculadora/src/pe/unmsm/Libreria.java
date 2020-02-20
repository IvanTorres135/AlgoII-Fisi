package pe.unmsm;
import java.util.*;

public class Libreria {
   private String cadena;
   private Double resultado;
   private boolean suma;
   private boolean resta;
   private boolean multiplicacion;
   private boolean division;

    
   public Libreria(){
       cadena="";
       suma=false;
       resta=false;
       multiplicacion=false;
       division=false;
   }
   
    public void borrarT(String cadena){
        this.cadena="";
    }
   
    public String concatenamiento(String cad){
        this.cadena =cadena+cad;
        return this.cadena;
    }
    
     public void suma(String cad){
        this.resultado = Double.parseDouble(cad);
        suma =true;
        this.cadena ="";
    }
     
    public void resta(String cad){
        this.resultado = Double.parseDouble(cad);
        resta =true;
        this.cadena="";
    }
    
    public void multiplicacion(String cad){
        this.resultado = Double.parseDouble(cad);
        multiplicacion =true;
        this.cadena="";
    }
        
    public void division(String cad){
        this.resultado = Double.parseDouble(cad);
        division =true;
        this.cadena="";
    }
    
    public double resultado(String cad){
        if(suma==true){
            resultado = resultado+ Double.parseDouble(cad);
        }
        else if(resta==true){
            resultado = resultado - Double.parseDouble(cad);
        }
        else if(multiplicacion==true){
            resultado = resultado * Double.parseDouble(cad);
        }
        else if(division==true){
              try{  
                resultado = resultado / Double.parseDouble(cad);
              }catch(ArithmeticException e){
                  resultado=0.0;
                  System.out.println("incorrecto "+e.getMessage());
              }
        }
       suma=false;resta=false;multiplicacion=false;division=false;
        return resultado;
    }   
}
