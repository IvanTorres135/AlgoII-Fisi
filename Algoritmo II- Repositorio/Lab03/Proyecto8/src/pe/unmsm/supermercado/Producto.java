package pe.unmsm.supermercado;
public class Producto {
    String codigo;
    String descr;
    
    public Producto(){  
    }
       
    public Producto(String cod,String des,double pre,int cant){
        this.codigo=cod;
        this.descr=des;
    }

    public void setCodigo(String cod){
        this.codigo=cod;
    }
    
    public void setDescr(String des){
        this.descr=des;
    }
           
    public String getCodigo(){
        return codigo;
    }
    
    public String getDescri(){
        return descr;
    }
    

    public void menu(){
        System.out.println("SUPERMERCADO EL BUENO");
        System.out.println("Lista de Productos");
        System.out.println("1. Inka Kola");
        System.out.println("2. Coca cola");
        System.out.println("3. Panetón");
        System.out.println("4. Papel Higénico");
        System.out.println("0. SALIR y PAGAR");
        System.out.printf("Ingrese el producto que desea comprar: ");
    }
    
    public void medio_pago(){
        System.out.println("Medios de Pago");
        System.out.println("1. Efectivo");
        System.out.println("2. Cheque");
        System.out.println("3. Tarjeta");
        System.out.printf("Elija el medio de pago a pagar: ");
    }
}