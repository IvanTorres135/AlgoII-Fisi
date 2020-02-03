package pe.unmsm.prestamo_libro;
import java.util.Scanner;
public class Principal {
    public static void main(String[] args){
    Scanner leer=new Scanner(System.in);
    Persona alumno=new Persona();
    Prestamo operacion=new Prestamo();
    int acum=0,cont=0,a,elim;
    String cod_alu,cod_lib,nom,nom2;
    while(acum==0){
        alumno.menu();
        a=leer.nextInt();
        if(a<=0 || a>4){
            System.out.println("Ha ingresado una opción errónea\n");
        }else{
            switch(a){
                case 1:cont=cont+1;
                        System.out.printf("Ingrese el codigo de alumno: ");
                        cod_alu=leer.next();
                        System.out.printf("Ingrese el nombre del alumno: ");
                        nom=leer.next();
                        System.out.printf("Ingrese el codigo del Libro: ");
                        cod_lib=leer.next();
                        System.out.printf("Ingrese el nombre del Libro: ");
                        nom2=leer.next();
                        operacion.RealizarRegistro(cont, cod_alu, nom, cod_lib, nom2);
                        System.out.println("El registro procedio con éxito\n");
                        break;
                case 2:
                    operacion.MostrarHistorial(cont);
                    break;
                case 3: 
                        System.out.printf("Ingrese el registro a eliminar: ");
                        elim=leer.nextInt();
                        operacion.EliminarRegistro(elim);
                        System.out.println("Registro eliminado\n");
                        break;
                case 4: acum=1;break;
            }
        }
    }
    }
    
}
