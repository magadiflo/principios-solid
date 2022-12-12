package amigoscode.solid;

/**
 * Si hubiéramos definido este método en la interfaz
 * Shape(), esto habría obligado a todas las clases concretas
 * a implementar el método volume(). Esto estaría violando
 * el principio de Interface Segregation, ya que el cuadrado,
 * círculo, rectángulo no tienen volumen... pero sí el cubo.
 * Entonces, lo que este principio indica es que no debemos obligar
 * a las clases concretas depender de interfaces que no usan, en este caso,
 * de métodos que no usarán jamás. Por lo tanto, para solucionar el problema
 * debemos crear una nueva interfaz con el método volumen(), y
 * únicamente implementará dicha interfaz aquella clase que tenga la
 * condición de poder calcularse su volumen, como es el del cubo.
 */

public interface ThreeDimensionalShape {

    double volume();

}
