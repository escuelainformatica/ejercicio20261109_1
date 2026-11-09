/**
 * Modelo que representa un rectangulo.
 * Propiedades: alto y ancho.
 */
public class Rectangulo {

    // Propiedades del rectangulo (variables dentro del modelo)
    private double alto;
    private double ancho;

    // Constructor: se ejecuta al crear un nuevo Rectangulo
    public Rectangulo(double alto, double ancho) {
        this.alto = alto;
        this.ancho = ancho;
    }

    // Getter: permite leer el valor de alto
    public double getAlto() {
        return alto;
    }

    // Setter: permite cambiar el valor de alto
    public void setAlto(double alto) {
        this.alto = alto;
    }

    // Getter: permite leer el valor de ancho
    public double getAncho() {
        return ancho;
    }

    // Setter: permite cambiar el valor de ancho
    public void setAncho(double ancho) {
        this.ancho = ancho;
    }
}
