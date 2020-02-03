package pe.unmsm.prestamo_libro;

public class Prestamo {
    static Persona[] ListaPer =new Persona[100];
    static Libro[] ListaLib =new Libro[100];
    int d0,m0;
    
    Persona alumno=new Persona();
    Libro libro=new Libro();
        
    public void RealizarRegistro(int acum,String cod_alum,String nom,String cod_lib,String nom2){
        ListaPer[acum]=new Persona(cod_alum,nom);
        ListaLib[acum]=new Libro(cod_lib,nom2);
    }
    
    public void EliminarRegistro(int acum){
        ListaPer[acum]=null;
        ListaLib[acum]=null;
    }
    
    public void MostrarHistorial(int acum){
        System.out.println("\nHISTORIAL REGISTRO");
        System.out.println("Reg\tCod.Alum \tNombre \t\tCod.Lib \tNom.Lib");
        System.out.println("==================================================================");
        for(int i=1;i<=acum;i++){
            if(ListaPer[i]!=null && ListaLib[i]!=null){
                System.out.println(i+"\t"+ListaPer[i].cod_alumno+"\t"+ListaPer[i].nombre+"\t\t"+ListaLib[i].Cod_libro+"\t\t"+ListaLib[i].Nom_libro);
            }
        }
        System.out.println("");
    }
}
