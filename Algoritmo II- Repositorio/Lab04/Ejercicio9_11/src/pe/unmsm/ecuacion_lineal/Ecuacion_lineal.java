package pe.unmsm.ecuacion_lineal;
import java.lang.Math;
public class Ecuacion_lineal {
    private int a,b,c,d,e,f;
    public Ecuacion_lineal(){
        
    }
    
    public Ecuacion_lineal(int a, int b, int c, int d, int e, int f){
        this.a=a;
        this.b=b;
        this.c=c;
        this.d=d;
        this.e=e;
        this.f=f;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public int getC() {
        return c;
    }

    public void setC(int c) {
        this.c = c;
    }

    public int getD() {
        return d;
    }

    public void setD(int d) {
        this.d = d;
    }

    public int getE() {
        return e;
    }

    public void setE(int e) {
        this.e = e;
    }

    public int getF() {
        return f;
    }

    public void setF(int f) {
        this.f = f;
    }
    
     public boolean EsSolucionable(int a, int b, int c, int d){
         int calculo;
         calculo=a*d-b*c;
         if(calculo==0){
             return false;
         }else{
             return true;
         }
     }
     
     public float getX(int a, int b, int c, int d, int e, int f){
         float calculo;
         calculo=(e*d-b*f)/(a*d-b*c);
         return calculo;
     }
     
    public float getY(int a, int b, int c, int d, int e, int f){
         float calculo;
         calculo=(a*f-e*c)/(a*d-b*c);
         return calculo;
     }
}
