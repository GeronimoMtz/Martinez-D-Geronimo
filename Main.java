
public class Main {

    public static void main(String[] args){
 
        int numero=0,a=0,b=1,c;
       
        do{
            System.out.println(a);
            c = a + b;
            a = b;
            b = c;
           numero++;
        }while(numero<=10);
  

    }
}