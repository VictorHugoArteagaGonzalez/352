
package califi;

import java.util.Scanner;

public class Califi {

   
    public static void main(String[] args) {
        
    int reprobados = 0;

    float calif=0;
    int i=1;
    Scanner sc=new Scanner(System.in);
    while (i<=5)
    {
        System.out.print("Dame la Calificacion del primer alumno :  ");
    calif=sc.nextFloat();
    if(calif>=9 && calif<=10)
    {
    }
        else if (calif>=6)
                {
                
                }
        else 
            reprobados++;
    i++;
    }
    
    System.out.println("Cantidad de alumnos reprobados:"+reprobados);
    }
}
    