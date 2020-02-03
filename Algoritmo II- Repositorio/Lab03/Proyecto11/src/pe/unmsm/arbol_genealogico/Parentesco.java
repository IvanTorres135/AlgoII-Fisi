package pe.unmsm.arbol_genealogico;

public class Parentesco {
    static Persona[] ListaPersonas=new Persona[50];
    int acum;
    public void AgregarArbol(int acum,String nom,String ape_pat,String ape_mat,int edad,String sex,String nom_padre,String ape_mat_padre,String nom_madre,String ape_mat_madre){
        ListaPersonas[acum]=new Persona(nom,ape_pat,ape_mat,edad,sex,nom_padre,ape_mat_padre,nom_madre,ape_mat_madre);
    }
    
    public void veririficar_relacion(int acum,String nom,String ape_pat,String ape_mat,int edad2,String sex,String nom_padre,String ape_mat_padre,String nom_madre,String ape_mat_madre){
        //Identificar al padre
        System.out.println("El padre es: "+nom_padre+" "+ape_pat+" "+ape_mat_padre);
        //Identificar a la madre
        System.out.println("La madre es: "+nom_madre+" "+ape_mat+" "+ape_mat_madre);
        for(int j=1;j<=acum;j++){                      
            //identificar a mi hermano (a)
            if(ListaPersonas[j].ape_pat.equals(ape_pat) && ListaPersonas[j].ape_mat.equals(ape_mat) ){
                if(ListaPersonas[j].sex.equals("M") || ListaPersonas[j].sex.equals("m")){
                    System.out.println("El hermano es: "+ListaPersonas[j].nombre+" "+ListaPersonas[j].ape_pat+" "+ListaPersonas[j].ape_mat);
                }
                else{
                    System.out.println("La hermana es: "+ListaPersonas[j].nombre+" "+ListaPersonas[j].ape_pat+" "+ListaPersonas[j].ape_mat);
                }
            }
            

            //Identificar al hijo (a)
            if(ListaPersonas[j].ape_pat.equals(ape_pat) && ListaPersonas[j].padre_ape_mat.equals(ape_mat) && ListaPersonas[j].padre_nom.equals(nom)){
                if(ListaPersonas[j].sex.equals("M") || ListaPersonas[j].sex.equals("m")){
                    System.out.println("El hijo es: "+ListaPersonas[j].nombre+" "+ListaPersonas[j].ape_pat+" "+ListaPersonas[j].ape_mat);
                }
                else{
                    System.out.println("La hija es: "+ListaPersonas[j].nombre+" "+ListaPersonas[j].ape_pat+" "+ListaPersonas[j].ape_mat);
                }
            }       
        }
    }
    
    public void menu(){
        System.out.println("\nARBOL GENEALÓGICO");
        System.out.println("1. Ingrese Personas");
        System.out.println("2. Muestre Parentesco");
        System.out.println("3. Salir");
        System.out.printf("Ingrese la opción que desea realizar: ");
    }
}
