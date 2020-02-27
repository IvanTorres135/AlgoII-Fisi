package fisi;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args){
        int n;
        Scanner leer=new Scanner(System.in);
        System.out.println("Serie de Fibonacci");
        System.out.printf("Ingrese el número de términos a calcular: ");
        n=leer.nextInt();
        if(n==1){
            System.out.println("1");
        }else{
            if(n==2){
                System.out.println("1 1");
            }else{
                Thread t1=new Thread(new Fibo(n));
                System.out.printf("1 1");
                t1.start();
            }
        }
    }
    
}
