package fisi;
import java.util.List;

public class SubListaThread implements Runnable{
    int sumLocal=0;
    List<Integer> lista;
    int ini,fin;
    
    public SubListaThread(List<Integer> lista, int ini, int fin){
        this.lista=lista;
        this.ini=ini;
        this.fin=fin;
    }
    
    public void makeLocalSum() {
        int s=0;
        for(int i=ini;i<fin;i++){
            s=s+lista.get(i);
        }
        sumLocal=s;
    }
    public int getSumLocal(){
        return sumLocal;
    }
    
    @Override
    public void run() {
        makeLocalSum();
    }
    
}
