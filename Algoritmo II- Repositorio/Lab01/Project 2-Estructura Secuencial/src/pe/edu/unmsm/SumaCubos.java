package pe.edu.unmsm;
import java.util. Scanner;
public class SumaCubos {
    static int n;
    public static void main(System args[]){
        Scanner leer=new Scanner(System.in);
        System.out.println("Suma de cubos hasta el valor de n: ");
        n=leer.nextInt();
        //formula n= n*n*(n+1)*(n+1)/4
        System.out.println("La suma de cubos es: "+ n*n*(n+1)*(n+1)/4);
    }
}
