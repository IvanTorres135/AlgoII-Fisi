package pe.unmsm.discriminante;
import java.lang.Math;

public class Discriminante {
    private int a,b,c;
    public Discriminante(){
        
    }
    
    public Discriminante(int a, int b, int c){
        this.a=a;
        this.b=b;
        this.c=c;
    }
    
    public void setA(int a){
        this.a=a;
    }
    
    public int getA(){
        return a;
    }
    
    public void setB(int b){
        this.b=b;
    }
    
    public int getB(){
        return b;
    }
    
    public void setC(int c){
        this.c=c;
    }
    
    public int getC(){
        return c;
    }
    
    public double getDiscriminante(int a, int b, int c){
        double calculo;
        calculo=b*b-4*a*c;
        return calculo;
    }
    
    public double getRoot1(int a, int b, int c){
        double calculo;
        calculo=(-b+Math.sqrt(getDiscriminante(a,b,c)))/2*a;
        return calculo;
    }
    
        public double getRoot2(int a, int b, int c){
        double calculo;
        calculo=(-b-Math.sqrt(getDiscriminante(a,b,c)))/2*a;
        return calculo;
    }
        
}
