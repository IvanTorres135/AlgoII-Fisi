package unmsm;

public class Union {
    public static void main(String[] args){
        int A[]={1,3,5,7,10};
        int B[]={2,3,7,9,10,11,15};
        int C[]={0,0,0,0,0,0,0,0,0,0,0,0};
        int n,m, acum=0,i=0,j=0;
        n=A.length;
        m=B.length;
        while(i<m && j<n){
            if(A[i]<B[j]){
                C[acum]=A[i];
                i++;
            }else{
                if(A[i]!=B[j]){
                    C[acum]=B[j];
                    j++;
                }else{
                    C[acum]=A[i];
                    i++;
                    j++;
                }
            }
            acum++;
        }
        if(j<m){
            for(int k=j;k<m;k++){
                C[acum]=B[k];
                acum++;
            }
        }
        if(i<n){
            for(int k=i;k<n;k++){
                C[acum]=A[k];
                acum++;
            }    
        }
  
        for(int k=0;k<C.length;k++){
            if(C[k]!=0)
                System.out.printf(" "+C[k]);
        }
        System.out.println("");
    }
    
}
