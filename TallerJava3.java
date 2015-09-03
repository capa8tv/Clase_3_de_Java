package tallerjava3;

public class TallerJava3 {

    
    public static void main(String[] args) 
    {
        int num1,num2;
        num1=23;
        //condiciones simples
        if( num1 == 23 && num1 > 25    )
        {
            System.out.println("la condición de cumple");
        }else
        {
            System.out.println("no se cumple la condición");
        }
        //controles de flujo
        switch( num1)
        {
            case 12:
                System.out.println("es igual a 12");
            break; 
            case 13:
                System.out.println("es igual a 13");
            break;
            case 24:
                System.out.println("es igual a 24");
            break;
            case 15:
                System.out.println("es igual a 15");
            break;
            default:
                System.out.println("no se cumplió ninguna de las condiciones");    
            break;    
        }
        
    }
    
}
