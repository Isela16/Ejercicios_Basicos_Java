
package ejerciciosjava;

import java.util.Scanner;

public class Ascensor2 {

     private Scanner scanner;
	
     public Ascensor2 (Scanner scanner) {
        this.scanner = scanner;
	}
	
    public void iniciarPesoAscensor() {
            pedirPeso();
            pedirDatosPiso();
    }

    public void pedirPeso() {
            System.out.print("Ingresa tú peso");
            Integer peso = scanner.nextInt();

            procesarDatos(peso);

    }

    public void procesarDatos(Integer peso) {
            if (peso > 0 && peso < 80) {
                    System.out.print("Tu peso está dentro del rango permitido ");			
            }else {
                    System.out.print("Tu peso sobre pasa el limite");
            }
    }
    public void pedirDatosPiso() {

            System.out.println("Ingresar el numero de piso");
            Integer piso = scanner.nextInt();
            procesarDatos(piso);

            procesarDatosPiso(piso);
            }
    public void procesarDatosPiso(Integer piso){
            if (piso > 0 && piso < 6){
                 System.out.println("El ascensor se esta moviendo al piso indicado");
                 }
            else {
                 System.out.println("¡ERROR! Piso no esta disponible");
                 }
} 
}
