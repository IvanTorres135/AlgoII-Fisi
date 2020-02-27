package fisi;

public class Fibo implements Runnable{
    int n;
    public Fibo(int num){
        this.n=num;
    }
    
    @Override
    public void run() {
        int acum1=1,acum2=1,sum=0;
        
        for(int i=3;i<=n;i++){
            sum=acum1+acum2;
            System.out.printf(" "+sum);
            acum1=acum2;
            acum2=sum;
        } 
        System.out.println("");
    }
    
}
