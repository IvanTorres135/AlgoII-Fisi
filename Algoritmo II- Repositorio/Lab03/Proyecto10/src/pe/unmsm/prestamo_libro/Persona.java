package pe.unmsm.prestamo_libro;

public class Persona {
    String cod_alumno;
    String nombre;
    public Persona(){
        
    }
public Persona(String cod,String nom)    {
    this.cod_alumno=cod;
    this.nombre=nom;
}

    public String getCod_alumno() {
        return cod_alumno;
    }

    public void setCod_alumno(String cod_alumno) {
        this.cod_alumno = cod_alumno;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public void menu(){
        System.out.println("PRESTAMO DE LIBROS");
        System.out.println("1. Prestamo de Libro");
        System.out.println("2. Mostrar Historial Libros Prestados");
        System.out.println("3. Eliminar Registro");
        System.out.println("4. Salir");
        System.out.printf("Ingrese la opción ha realizar: ");
    }
}
