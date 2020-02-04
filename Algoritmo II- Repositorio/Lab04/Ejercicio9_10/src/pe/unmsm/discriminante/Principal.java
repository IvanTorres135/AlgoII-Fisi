package pe.unmsm.discriminante;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args){
        Scanner leer=new Scanner(System.in);
        Discriminante operacion=new Discriminante();
        int a,b,c;
        System.out.println("SOLUCION DE LA ECUACIÓN CUADRÁTICA");
        System.out.printf("Ingrese el valor de a: ");a=leer.nextInt();
        System.out.printf("Ingrese el valor de b: ");b=leer.nextInt();
        System.out.printf("Ingrese el valor de c: ");c=leer.nextInt();
        if(operacion.getDiscriminante(a, b, c)<0){
            System.out.println("La ecuación no tiene raices");
        }else{
            if(operacion.getDiscriminante(a, b, c)==0){
                System.out.println("La solución es: "+(-b)/(2*a));
            }else{
                System.out.println("Se obtuvieron las siguientes raices");
                System.out.printf("R1: "+operacion.getRoot1(a, b, c));
                System.out.printf("\nR2: "+operacion.getRoot2(a, b, c));
            }
        }
    }
    
}
