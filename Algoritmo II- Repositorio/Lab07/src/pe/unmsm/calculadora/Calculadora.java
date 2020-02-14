package pe.unmsm.calculadora;
import java.math.*;
public class Calculadora {
    public float suma;
    public Calculadora(){
        
    }
    
    public float analizar(String cad){
        int n;
        float x=0,y=0,sum=0;
        n=cad.length();
        for(int i=0;i<n;i++){  
            if(cad.charAt(i)==43){// 43 es el codigo ascci de "+"
                //es suma
                x=CompletaIzq(i-1,cad);
                y=CompletaDer(i+1,cad);
                sum=x+y;
            }
            if(cad.charAt(i)==45){// 43 es el codigo ascci de "-"
                 //es resta
                x=CompletaIzq(i-1,cad);
                y=CompletaDer(i+1,cad);
                sum=x-y;
            }
            if(cad.charAt(i)==42){// 42 es el codigo ascci de "-"
                //es multiplicacion
                x=CompletaIzq(i-1,cad);
                y=CompletaDer(i+1,cad);
                sum=x*y; 
            }
            if(cad.charAt(i)==47){// 42 es el codigo ascci de "/"
                //es division
                x=CompletaIzq(i-1,cad);
                y=CompletaDer(i+1,cad);
                sum=x/y;
            }
        }
        if(x<0||y<0){
            System.out.println("Se debe ingresar números");
            return -99999;
        }else{
            return sum;
        }
    }
    
    public float CompletaIzq(int a, String cad){//a es la posicion del ultimo numero de la izquierda
        int j=0;
        double sum=0;
        for(int i=a; i>=0;i--){
            sum=sum+(cad.charAt(i)-48)*Math.pow(10, j);//48 es el codigo ascii del "0"
            j=j+1;
            if(cad.charAt(i)<48 || cad.charAt(i)>58){
                sum=-1;break;
            }
        }
        return (float)sum;
    }

    public float CompletaDer(int a, String cad){//a es la posicion inicial del numero a la derecha
        int j=0;
        double sum=0;
        for(int i=cad.length()-1;i>=a;i--){
            sum=sum+(cad.charAt(i)-48)*Math.pow(10, j);
            j=j+1;
            if(cad.charAt(i)<48 || cad.charAt(i)>58){
                sum=-1;break;
            }
        }
        return (float)sum;
    }
}
