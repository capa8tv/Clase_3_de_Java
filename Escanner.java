
package tallerjava3;

import java.util.Scanner;

public class Escanner {

   
    public static void main(String[] args) {
     
        Scanner c = new Scanner(System.in);
        System.out.println("escriba su edad");
        String edad =c.next();
        System.out.println("escriba un número");
        int num=c.nextInt();
        String n=Integer.toString(num);
        System.out.println("tu edad es = "+edad);
        System.out.println("el valor de número es ="+n);
        //cast o refundición
        int e=Integer.parseInt(edad);
        e++;
        System.out.println("el próximo año tu edad será "+e);
    }
    
}
