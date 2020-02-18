
import java.util.Scanner;


/**
 * Programa para encontrar el area entre un cuadrado y un circulo al interior de este  * 
 * @author Jeimmy Naranjo   
 * @version 1
 */
public class PrincipalAreaS  //Declaracion de la clase Principal
{
    public static void main(String[] args) 
    {
        // Datos de entrada
      
        double radio;
        
    
        // Datos de salida
      
        double Area;
 
        // Necesito acceso al teclado
        Scanner teclado = new Scanner(System.in);
        // Preguntar datos de entrada
        System.out.print("Ingrese el valor del radio del circulo\n");
        radio = teclado.nextDouble(); 
        
        double AreaCi = Math.PI * Math.pow(radio,2);
        //double Diagonal = Math.pow(radio,2);
        //double AreaCu = (Math.pow(Diagonal,2))/2;
        //Area = AreaCu - AreaCi;
        
        double Hipotenuza = Math.hypot(radio, radio);
        double AreaCu = Math.pow(Hipotenuza,2);
        Area = AreaCu - AreaCi;
        if (Area < 0)
        {
            Area = Area * -1;
        }
        System.out.print("El area de la region sombreada es:  " + Area);
      
        
        
 
    }
            
  } 