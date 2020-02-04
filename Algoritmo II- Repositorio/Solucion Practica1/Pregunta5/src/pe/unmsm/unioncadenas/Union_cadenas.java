package pe.unmsm.unioncadenas;

import java.util.Arrays;

public class Union_cadenas {
    public static void main(String[] args){
    int cadena1[]={1,3,6,8,10,15,19,24,74};//las 2 cadenas están ordenadas
    int cadena2[]={2,3,7,20,24,54};
    Union(cadena1,cadena2);
    }
    
    public static void Union(int cadena1[],int cadena2[]){
        int [] cadena_final=new int[cadena1.length+cadena2.length+1];//se define el vector de la suma
        int m,n,temp;
        m=cadena1.length;
        n=cadena2.length;
        //union las cadenas en 1 sola cadena
        //primero copiamos tal cual la cadena 1
        System.arraycopy(cadena1, 0, cadena_final, 0, m);
        //segundo agregamos la cadena2 en la cadena union
        System.arraycopy(cadena2, 0, cadena_final, m, n);
       
        //ahora ordenaremos
        for(int i=0;i<m+n;i++){
            for(int j=0;j<m+n-1;j++){
                if(cadena_final[j]>cadena_final[j+1]){
                    temp=cadena_final[j];
                    cadena_final[j]=cadena_final[j+1];
                    cadena_final[j+1]=temp;
                }
            }
        }
        //eliminando duplicados
        for(int i=0;i<m+n;i++){
            if(cadena_final[i]!=cadena_final[i+1]){
                System.out.print(" "+cadena_final[i]);
            }
        }
        System.out.println("");
        //System.out.println(Arrays.toString(cadena_final));
    }
    
}