package pe.unmsm.areafigura;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args){
        Calculo operacion=new Calculo();
        Scanner leer=new Scanner(System.in);
        int cont=0,a,b;
        double n,n2,n3;
        while (cont==0){
            operacion.menu();
            a=leer.nextInt();
            if(a<=0 || a>6){
                System.out.println("Ha ingresado un valor incorrecto\n");
            }else{
                switch(a){
                    case 1:
                            System.out.printf("Ingrese el lado del cuadrado: ");n=leer.nextDouble();
                            System.out.printf("El area del cuadrado es: "+operacion.Area(n)+"\n\n");break;
                    case 2: 
                            System.out.printf("Ingrese el lado 1: ");n=leer.nextDouble();
                            System.out.printf("Ingrese el lado 2: ");n2=leer.nextDouble();
                            System.out.printf("El area del rectangulo es: "+operacion.Area(n,n2)+"\n\n");break;
                    case 3:
                            System.out.printf("Ingrese el lado 1: ");n=leer.nextDouble();
                            System.out.printf("Ingrese el lado 2: ");n2=leer.nextDouble();
                            System.out.printf("Ingrese el lado 3: ");n3=leer.nextDouble();
                            System.out.printf("El area del triangulo es: "+operacion.Area(n,n2,n3)+"\n\n");break;
                    case 4: 
                            System.out.printf("Ingrese el radio del circulo: ");b=leer.nextInt();
                            System.out.printf("El area del circulo es: "+operacion.Area(b)+"\n\n");break;
                    case 5: cont=1;break;
                }
            }
        }
    }
    
}
