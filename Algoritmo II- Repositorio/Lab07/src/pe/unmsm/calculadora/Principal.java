package pe.unmsm.calculadora;
import java.util.Scanner;
import java.util.InputMismatchException;

public class Principal {
    public static void main(String[] args){
        String cad,cad2;
        float sol;
        Scanner leer=new Scanner(System.in);
        Calculadora ope=new Calculadora();
        System.out.println("CALCULADORA");
        System.out.printf("Ingrese la operacion a realizar: ");
        cad=leer.nextLine();
        cad2=cad.replace(" ",""); //reemplaza todos los espacios en blanco a cadenas vacias
        try{
            sol=ope.analizar(cad2);
            if(sol>0){
                System.out.println("La solución es: "+sol);
            }
        }catch(ArithmeticException e){
            System.out.println("La solución es: Infinity");
        }
    }

}
