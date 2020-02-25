package unmsm;
import java.util.*;

public class Palabra {
    public static void main(String[] args){
        //String cad="Adelante San Marcos Glorioso, Adelante tu siempre estarás";
        List<String> frase= new ArrayList<String>();
        Scanner leer=new Scanner(System.in);
        System.out.printf("Ingrese una cadena para ser invertida: ");
        String cad=leer.nextLine();
        if(cad.indexOf(" ")<0){ //cuando se ingresa solo 1 palabra
            System.out.println("La frase invertida es: "+cad);
        }else{      
            int pos1=cad.indexOf(" ");//encuenta la posición del primer espacio en la cadena
            int pos2=0,n;
            String cad2;            //cad.substring(0,pos1) == string de la posicion cero hasta la pos1-1
            frase.add(cad.substring(0,pos1));//agrega (cad.substring(0,pos1)) a la lista de "frase"
            if(cad.indexOf(" ",pos1+1)<0){//cuando se ingresa solo 2 palabras
                frase.add(cad.substring(pos1,cad.length()));
                System.out.printf("La frase invertida es: ");
                System.out.println(frase.get(1)+" "+frase.get(0));
            }else{
                //cad.indexOf(" ",pos1+1)==encuentra la posicion del siguiente espacio, a partir de la posicion pos1+1 en la cadena
                while(cad.indexOf(" ",pos1+1)>0){//mientras exista otro espacio, realizará el while
                    pos2=cad.indexOf(" ",pos1+1);//se guarda la nueva posicion del espacio
                    frase.add(cad.substring(pos1,pos2));// se agrega a la "frase" el string de pos1 a pos2
                    pos1=pos2;//La pos1 se convertirá en la posiscion 2
                }      
                frase.add(cad.substring(pos2));//se agregara a la "frase" la cadena de la posicion2 hasta el final
                n=frase.size();
                System.out.printf("\nLa frase invertida es:");
                for(int i=n-1;i>=0;i--){
                    System.out.printf(" "+frase.get(i));
                }
                System.out.println("");
            }
        }
    }
}
