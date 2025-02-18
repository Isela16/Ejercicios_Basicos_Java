
package ejercicios_java;

// Crear clase 

import java.util.Scanner;

public class Ejercicio_1 {
    //crear atributos
String saludoCliente= "Hola cliente....";
//crear constructor
// da el estado inicial del objeto

          public Ejercicio_1(){

          }
//crear metodos
          public boolean tomarDatos(){
                    System.out.println(saludoCliente);
                    Scanner objTeclado = new Scanner(System.in);
                    System.out.println("Escriba el nombre del cliente");
                    String nombreCliente = objTeclado.nextLine();
                    System.out.println("Escriba el apellido del cliente");
                    String apellidoCliente = objTeclado.nextLine();
                    
                    Ejercicio_1.calcularDatos(nombreCliente, apellidoCliente);

                    return true;
          }
          
          private static void calcularDatos( String datoNombre, String datoApellido) {
                    System.out.println ("nombre cliente: " + datoNombre);
                    System.out.println ("apellido cliente: " + datoApellido);
                    
          }

          public void mostrarResultados(){
                    System.out.println(saludoCliente);
          }
}
