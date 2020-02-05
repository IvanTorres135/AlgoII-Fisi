package pe.unmsm.ecuacion_lineal;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args){
        Scanner leer=new Scanner(System.in);
        Ecuacion_lineal operacion=new Ecuacion_lineal();
        int a,b,c,d,e,f;
        System.out.println("SOLUCION DE LA ECUACIÓN LINEAL 2X2");
        System.out.printf("Ingrese el valor de a: ");a=leer.nextInt();
        System.out.printf("Ingrese el valor de b: ");b=leer.nextInt();
        System.out.printf("Ingrese el valor de c: ");c=leer.nextInt();
        System.out.printf("Ingrese el valor de d: ");d=leer.nextInt();
        System.out.printf("Ingrese el valor de e: ");e=leer.nextInt();
        System.out.printf("Ingrese el valor de f: ");f=leer.nextInt();
        if(operacion.EsSolucionable(a, b, c, d)==false){
            System.out.println("La ecuación no tiene soluciones");
        }else{
            System.out.println("La solución es");
            System.out.println("X: "+operacion.getX(a, b, c, d, e, f));
            System.out.println("Y: "+operacion.getY(a, b, c, d, e, f));
        }
    }
}
