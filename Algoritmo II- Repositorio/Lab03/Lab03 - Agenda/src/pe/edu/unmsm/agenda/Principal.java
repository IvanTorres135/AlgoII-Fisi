package pe.edu.unmsm.agenda;
import java.util.Scanner;
public class Principal {
    public static void main(String[] args) {
    Scanner leer = new Scanner(System.in);
    
    int cont=0,i, acum=0, edad,eliminar;
    String nombre, apellido;
    double sueldo;
    
    Agenda proceso= new Agenda();
    while(cont==0){
        proceso.Menu();
        System.out.printf("Ingrese una opción:");
        i=leer.nextInt();
        System.out.println("");
        if(i<=0 || i>4){
            System.out.println("Ha ingresado un valor incorrecto\n");
        }
        else{
            switch(i){
                case 1:acum=acum+1;
                       System.out.println("Contacto n° "+acum);
                       System.out.printf("Ingrese el nombre: ");nombre=leer.next();
                       System.out.printf("Ingrese el Apellido: ");apellido=leer.next();
                       System.out.printf("Ingrese la edad: ");edad=leer.nextInt();
                       System.out.printf("Ingrese el sueldo: "); sueldo=leer.nextDouble();
                       System.out.println("");
                       proceso.AgregarContacto(acum, nombre, apellido, edad, sueldo);break;
                case 2:System.out.printf("Ingrese el Contacto que desea eliminar: ");
                       eliminar=leer.nextInt();
                       if(eliminar<=acum){
                          proceso.EliminarContacto(eliminar); 
                       }
                       else{
                           System.out.println("Se ha ingresado una opción errónea");
                       }
                       break;
                case 3:proceso.MostrarContactos(acum);break;
                case 4: System.out.println("salir");cont=1;break;
            }
        }
    }
            
  }
}
