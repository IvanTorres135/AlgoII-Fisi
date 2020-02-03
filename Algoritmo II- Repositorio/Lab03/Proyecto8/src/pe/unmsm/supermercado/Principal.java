package pe.unmsm.supermercado;
import java.util.Scanner;
public class Principal {
    public static void main(String[] args){
        int acum=0,acum2,a,b,c;
        String cadena;
        int almacenado[]={15,10,5,20};//el stock se debe saber de ante mano
        double precios[]={3.5,3.5,10,15};//los precios ya se debe estar definido
        int sum=0,sum2=0,sum3=0,sum4=0;//va a contar la cantidad de aticulos
        double total;
        Scanner leer=new Scanner(System.in);
        Producto proceso=new Producto();
        while(acum==0){
            proceso.menu();
            a=leer.nextInt();
            if(a<0 || a>4){
                System.out.println("Ha ingresado un valor incorrecto\n");
            }else{acum2=0;
                switch(a){
                    case 0: acum=1;
                            System.out.println("RESUMEN DEL PAGO");
                            System.out.println("Articulo\tcantidad \tprecio\t");
                            System.out.println("Inca kola\t"+sum+"\t\t"+precios[0]);
                            System.out.println("Coca cola\t"+sum2+"\t\t"+precios[1]);
                            System.out.println("Panetón\t\t"+sum3+"\t\t"+precios[2]);
                            System.out.println("Papel Higénico\t"+sum4+"\t\t"+precios[3]);
                            System.out.println("=====================================");
                            total=sum*precios[0]+sum2*precios[1]+sum3*precios[2]+sum4*precios[3];
                            System.out.println("TOTAL: "+total);
                            System.out.println("");
                            proceso.medio_pago();
                            c=leer.nextInt();
                            if(c==1){System.out.println("GRACIAS POR SU COMPRA");}
                            if(c==2){System.out.println("Acercarse con DNI y verificar los datos");
                                    System.out.println("GRACIAS POR SU COMPRA");}
                            if(c==3){System.out.println("Acercarse al POS");
                                    System.out.println("GRACIAS POR SU COMPRA");}
                            break;
                    case 1: while(acum2==0){
                                System.out.printf("Ingrese la cantidad de productos que desea comprar: ");
                                b=leer.nextInt();System.out.println("");
                                if(b<=almacenado[0]){
                                   acum2=1;
                                   sum=sum+b;
                                   almacenado[0]=almacenado[0]-b;
                                }else{
                                    System.out.println("No se puede realizar la compra, sobre pasa el stock");
                                    System.out.println("Quedan "+almacenado[0]+" elementos");
                                }
                           }break;
                           
                     case 2: while(acum2==0){
                                System.out.printf("Ingrese la cantidad de productos que desea comprar: ");
                                b=leer.nextInt();System.out.println("");
                                if(b<=almacenado[1]){
                                   acum2=1;
                                   sum2=sum2+b;
                                   almacenado[1]=almacenado[1]-b;
                                }else{
                                    System.out.println("No se puede realizar la compra, sobre pasa el stock");
                                    System.out.println("Quedan "+almacenado[1]+" elementos");
                                }
                           }break;
                           
                      case 3: while(acum2==0){
                                System.out.printf("Ingrese la cantidad de productos que desea comprar: ");
                                b=leer.nextInt();System.out.println("");
                                if(b<=almacenado[2]){
                                   acum2=1;
                                   sum3=sum3+b;
                                   almacenado[2]=almacenado[2]-b;
                                }else{
                                    System.out.println("No se puede realizar la compra, sobre pasa el stock");
                                    System.out.println("Quedan "+almacenado[2]+" elementos");
                                }
                           }break;
                           
                       case 4: while(acum2==0){
                                System.out.printf("Ingrese la cantidad de productos que desea comprar: ");
                                b=leer.nextInt();System.out.println("");
                                if(b<=almacenado[3]){
                                   acum2=1;
                                   sum4=sum4+b;
                                   almacenado[3]=almacenado[3]-b;
                                }else{
                                    System.out.println("No se puede realizar la compra, sobre pasa el stock");
                                    System.out.println("Quedan "+almacenado[3]+" elementos");
                                }
                           }break;
                }
            }
        }
        //String a=leer.nextLine();
        //System.out.println("El valor de a es: "+a);
        
    }

}
