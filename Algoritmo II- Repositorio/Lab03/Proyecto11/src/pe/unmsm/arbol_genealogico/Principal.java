package pe.unmsm.arbol_genealogico;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args){
        Scanner leer=new Scanner(System.in);
        Parentesco proceso=new Parentesco();
        int cont=0,acum=0,i,edad,edad2,n;
        String nom,ape_pat,ape_mat,sex,sex2,padre_nom,padre,padre_ape_mat,madre_nom,madre_ape_mat;
        String nombre,ape_pater,ape_mater,nombre_padre,nombre_madre,ape_mater_padre,ape_mater_madre;
        while(cont==0){
        proceso.menu();
        i=leer.nextInt();
        System.out.println("");
        if(i<=0 || i>3){
            System.out.println("Ha ingresado un valor incorrecto\n");
        }
        else{
            switch(i){
                case 1:
                        System.out.printf("Ingrese la cantidad de personas: ");
                        n=leer.nextInt();
                        for(int j=1;j<=n;j++){
                            acum=acum+1;
                            //System.out.println("Persona n° "+j);
                            System.out.printf("\nIngrese el nombre: ");nom=leer.next();
                            System.out.printf("Ingrese el apellido paterno: ");ape_pat=leer.next();
                            System.out.printf("Ingrese el apellido materno: ");ape_mat=leer.next();
                            System.out.printf("Ingrese la edad : ");edad=leer.nextInt();
                            System.out.printf("Ingrese el sexo (M/F) : ");sex=leer.next();
                            System.out.printf("Ingrese el nombre del padre: ");padre_nom=leer.next();
                            System.out.printf("Ingrese el apellido materno del padre: ");padre_ape_mat=leer.next();
                            System.out.printf("Ingrese el nombre de la madre: ");madre_nom=leer.next();
                            System.out.printf("Ingrese el apellido materno de la madre: ");madre_ape_mat=leer.next();
                            proceso.AgregarArbol(acum, nom, ape_pat, ape_mat, edad,sex, padre_nom, padre_ape_mat, madre_nom, madre_ape_mat);
                        }break;
                case 2:
                        System.out.println("DATOS DEL USUARIO");
                        System.out.printf("Ingrese el nombre: ");nombre=leer.next();
                        System.out.printf("Ingrese el apellido paterno: ");ape_pater=leer.next();
                        System.out.printf("Ingrese el apellido materno: ");ape_mater=leer.next();
                        System.out.printf("Ingrese la edad : ");edad2=leer.nextInt();
                        System.out.printf("Ingrese el sexo (M/F) : ");sex2=leer.next();
                        System.out.printf("Ingrese el nombre del padre: ");nombre_padre=leer.next();
                        System.out.printf("Ingrese el apellido materno del padre: ");ape_mater_padre=leer.next();
                        System.out.printf("Ingrese el nombre de la madre: ");nombre_madre=leer.next();
                        System.out.printf("Ingrese el apellido materno de la madre: ");ape_mater_madre=leer.next();
                        System.out.println("A continuación se muestra el parentesco\n");
                        proceso.veririficar_relacion(acum, nombre, ape_pater, ape_mater, edad2,sex2, nombre_padre, ape_mater_padre, nombre_madre, ape_mater_madre);
                        break;
                case 3:cont=1;break;
            }
        }
        }
    }
    
}
