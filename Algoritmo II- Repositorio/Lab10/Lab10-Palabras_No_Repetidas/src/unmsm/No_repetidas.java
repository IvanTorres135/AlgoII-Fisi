package unmsm;
import java.util.*;

public class No_repetidas {
    public static void main(String[] args){
        String cad;
        Set<String> frase= new HashSet<>();      
        Scanner leer=new Scanner(System.in);
        System.out.printf("Ingrese la cadena a analizar: ");
        cad=leer.nextLine();
        if(cad.indexOf(" ")<0){ //cuando se ingresa solo 1 palabra
            System.out.println("La cadena tiene 1 palabra no repetida"); 
        }else{
            int pos1=cad.indexOf(" ");//encuenta la posición del primer espacio en la cadena
            int pos2=0,n;
            String cad2;
            frase.add(cad.substring(0,pos1));
            if(cad.indexOf(" ",pos1+1)<0){//cuando se ingresa solo 2 palabras
                frase.add(cad.substring(pos1+1,cad.length()));
            }else{
                while(cad.indexOf(" ",pos1+1)>0){//mientras exista otro espacio, realizará el while
                    pos2=cad.indexOf(" ",pos1+1);//se guarda la nueva posicion del espacio
                    frase.add(cad.substring(pos1+1,pos2));// se agrega a la "frase" el string de pos1 a pos2
                    pos1=pos2;//La pos1 se convertirá en la posiscion 2
                }
                frase.add(cad.substring(pos2+1));//se agregara a la "frase" la cadena de la posicion2 hasta el final
            }
         System.out.printf("Existe "+frase.size()+" palabras no repetidas");
        System.out.println("\n\nLas palabras sin repetir son:");
        for(String elemento: frase){
           System.out.println(elemento);
        }   
        }
    }
}   