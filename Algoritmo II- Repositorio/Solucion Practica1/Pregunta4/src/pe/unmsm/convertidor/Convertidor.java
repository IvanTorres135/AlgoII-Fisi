package pe.unmsm.convertidor;
import java.util.Scanner;
public class Convertidor {
    static Scanner leer=new Scanner(System.in);
    static String cadena;
    static char caracter,letra;
    static int n,ascii;
    
    public static void main(String[] args){
        System.out.println("Convertidor a Mayusculas");
        System.out.printf("Ingrese la cadena: ");
        cadena=leer.nextLine();
        n=cadena.length();
        for(int i=0;i<n;i++){
            caracter=cadena.charAt(i);//obtenermos el caracter en formato texto
            ascii=(char)(caracter);//convertimos a formato número
            if(ascii>=97 && ascii<=122){
                letra=(char) (ascii-32);//convertimos a letra luego de convertir a mayuscula
            }else{
                letra=(char) (ascii);
            }
            System.out.print(letra);
        }
        System.out.println("");
    }
}
