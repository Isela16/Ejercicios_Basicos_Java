
package ejerciciosjava;


import java.util.Scanner;

public class Ascensor {

     private Scanner scanner;
    
     public Ascensor (Scanner scanner){ this.scanner = scanner; }

     public void iniciarProceso(){

         pedirDatos();           
     }

     public void pedirDatos() {

         System.out.println("Ingresar el numero de piso");
         Integer piso = scanner.nextInt();
         procesarDatos(piso);
         }

     public void procesarDatos(Integer piso){
         if (piso > 0 && piso < 5){
              System.out.println("El ascensor se esta moviendo al piso indicado");
         }
         else {
              System.out.println("¡ERROR! Piso no esta disponible");
         }
} 
}
