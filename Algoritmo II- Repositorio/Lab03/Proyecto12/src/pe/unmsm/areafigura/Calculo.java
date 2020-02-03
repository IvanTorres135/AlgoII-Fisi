package pe.unmsm.areafigura;
import java.lang.Math;
public class Calculo {
    double peri,area;
    //cuadrado
    double PI=3.1415;
    public double Area(double a){
        return a*a;
    }
    //rectangulo
    public double Area(double a, double b){
        return a*b;
    }
    
    //triangulo (formula de heron
    public double Area(double a,double b,double c){
        peri=(a+b+c)/2;
        area=Math.sqrt(peri*(peri-a)*(peri-b)*(peri-c));
        return area;
    }
    
    //circulo
    public double Area(int r){
        return PI*r*r;
    }
    
    public void menu(){
        System.out.println("CALCULAR EL AREA");
        System.out.println("1. Cuadrado");
        System.out.println("2. Rectangulo");
        System.out.println("3. Triangulo");
        System.out.println("4. Circulo");
        System.out.println("5. Salir");
        System.out.printf("Ingrese la opción a realizar: ");
    }
}
