package pe.edu.unmsm.agenda;

public class Agenda {
    static Contacto [] ListaContactos= new Contacto[100];
    int num_conta=0;
       
    public void EliminarContacto(int acum){
        ListaContactos[acum]=null;
    }
    
    public void AgregarContacto(int acum, String nombre, String apellido, int edad, double sueldo){
       ListaContactos[acum]= new Contacto(nombre,apellido,edad,sueldo);
    }
    
    public void MostrarContactos(int acum){
        for(int i=1;i<=acum;i++){
            if(ListaContactos[i]!=null){
                System.out.println("\nContacto número "+i);
                System.out.println("El Nombre es: "+ListaContactos[i].Nombre);
                System.out.println("El Apellido es: "+ListaContactos[i].Apellido);
                System.out.println("La edad es: "+ListaContactos[i].edad);
                System.out.println("El sueldo es: "+ListaContactos[i].salario);
            }
        }
//ListaContactos[0]= new Contacto("Raul","Pacheco",20,1200.00);
    }
    
    public void Menu(){
        System.out.println("Menú de Opciones");
        System.out.println("1. Agregar Contactos");
        System.out.println("2. Eliminar Contactos");
        System.out.println("3. Mostrar Contactos");
        System.out.println("4. Salir");
    }
}
