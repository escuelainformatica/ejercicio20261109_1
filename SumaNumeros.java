import java.util.Locale;
import java.util.Scanner;
import carpeta2.carpeta3.carpeta4.Clase2;

/**
 * Aplicacion de consola que suma dos numeros ingresados por el usuario
 * y muestra el resultado en pantalla.
 */
public class SumaNumeros {

    public static void main(String[] args) {


        carpeta1.Clase1 obj = new carpeta1.Clase1();
        Clase2 obj2 = new Clase2();   

        // Scanner permite leer lo que el usuario escribe en la consola.
        // useLocale(Locale.US) hace que el punto (.) sea el separador decimal
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.print("Ingrese el primer numero: ");
        double primerNumero = scanner.nextDouble();

        System.out.print("Ingrese el segundo numero: ");
        double segundoNumero = scanner.nextDouble();

        // Suma de los dos numeros
        double suma = primerNumero + segundoNumero;

        // Mostrar el resultado en pantalla
        System.out.println("La suma de " + primerNumero + " + " + segundoNumero + " es: " + suma);

        // Variable que usa el modelo Rectangulo
        Rectangulo miRectangulo = new Rectangulo(5, 3);
        System.out.println("Rectangulo: alto = " + miRectangulo.getAlto()
                + ", ancho = " + miRectangulo.getAncho());

        scanner.close();
    }
}
