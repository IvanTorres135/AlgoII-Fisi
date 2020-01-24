package pe.edu.unmsm;
import java.util.Scanner;
public class AreaCilindro {
    static double r,h,A;
    public static void main(String[] args){
        Scanner leer=new Scanner(System.in);
        double PI=3.1415;
        System.out.println("AREA DEL CILINDRO");
        System.out.printf("Ingrese el radio del cilindro:");
        r=leer.nextDouble();
        System.out.printf("Ingrese la altura del cilindro:");
        h=leer.nextDouble();
        System.out.println("El Area del cilindro es: "+PI*r*r*h);
    }
}
