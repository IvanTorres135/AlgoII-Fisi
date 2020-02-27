package fisi;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Principal {
    public static void main(String[] args){
    int n=100; //numero de elementos
    int t=10;// numero de thread
    List<Integer> lista=new ArrayList<>();
    for (int i=0;i<n;i++){
        lista.add(i);//Se agregan una lista de 100 numeros, del 0 al 99
    }
    SubListaThread sbt;
    int sfinal=0;
    for(int i=0;i<t;i++){//se crean 10 hilos, se reparte los 100 números
        sbt=new SubListaThread(lista,i*(n/t),(i+1)*(n/t)); // al inicio es (lista, 0, n/t)
        Thread t1=new Thread(sbt);
        t1.start();
        try {
            t1.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        sfinal=sfinal+sbt.getSumLocal();//sfinal+=getSumLocal();
    }
    System.out.println("El promedio de los 100 numeros es: "+ (float)sfinal/n);   
    }
    
}
