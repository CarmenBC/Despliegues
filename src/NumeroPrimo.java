
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author farti
 */
public class NumeroPrimo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);        
        int numero,dividido;
        boolean primo = false;
        System.out.println("¿Cual número quieres saber si es primo o no?");
        numero =sc.nextInt();
        if (numero%2==0 && numero!=2){
            primo = true;
        }
        if (numero%3==0 && numero!=3){
            primo = true;
        }
        if (numero%5==0 && numero!=5){
            primo = true;
        }    
        if (numero%7==0 && numero!=7){
            primo = true;
        }
        if (numero%11==0 && numero!=11){
            primo = true;
        }    
        if (primo){
            System.out.println("El numero no es primo.");
        }
        else{
            System.out.println("El numero es primo.");
        }
         System.out.println("Esto es una prueba para GitHub");
    }
   
}
