package pe.unmsm.animal;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args){
        String [] Animales={"Antonio","Peluche","Minino","Laura","Iván","Firulais","Rambo","Fido","Tigresa","Juan"};
        int n,m;
        Hombre homb=new Hombre();
        Perro per=new Perro();
        Gato gat=new Gato();
        Scanner leer=new Scanner(System.in);
        
        for(int i=0;i<Animales.length;i++){
            System.out.println("Su nombre es "+Animales[i]);
            System.out.println("Tipo de especies");
            System.out.println("1. Persona");
            System.out.println("2. Perro");
            System.out.println("3. Gato");
            System.out.printf("Que tipo de animal es: ");
            m=0;
            while(m==0){
                n=leer.nextInt();
                if(m<0 || m>3){
                    System.out.println("Ha ingresado un número erróneo");
                }else{
                    System.out.printf("Habla los siguiente: ");
                    switch(n){
                        case 1: homb.Hablar();m=1;break;
                        case 2: per.Hablar();m=1;break;
                        case 3: gat.Hablar();m=1;break;
                    }
                }
            }
        }
    }

}
