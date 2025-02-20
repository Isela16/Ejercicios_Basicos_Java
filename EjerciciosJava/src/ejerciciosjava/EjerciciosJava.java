
package ejerciciosjava;

import java.util.Scanner;

public class EjerciciosJava {

    public static void main(String[] args) {
          Scanner scanner = new Scanner (System.in);

          //Ascensor ascensor = new Ascensor(scanner);
          //ascensor.iniciarProceso();

          Ascensor2 ascensor2 = new Ascensor2 (scanner);
          ascensor2.iniciarPesoAscensor ();
    }
    
}
