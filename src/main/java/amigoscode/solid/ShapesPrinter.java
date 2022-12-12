package amigoscode.solid;

import java.util.List;

/**
 * Modificando la clase para tener la condición de poder violar el
 * principio de Dependency Inversion.
 * Teníamos definido el atributo así:
 * private AreaCalculator areaCalculator = new AreaCalculator();
 * <p>
 * Allí ya estaríamos violando el principio de Dependency Inversion, ya que
 * nos dice que las dependencias deben estar en las abstracciones y no en
 * las concreciones, es decir, debemos usar la clase abstracta o interfaz
 * para definir un objeto, de esta manera no dependeremos de una clase
 * en concreto, sino más bien de su abstracción. En nuestro caso,
 * usamos la interfaz IAreaCalculator que no es una clase concreta.
 */

public class ShapesPrinter {

    private final IAreaCalculator areaCalculator;

    public ShapesPrinter(IAreaCalculator areaCalculator) {
        this.areaCalculator = areaCalculator;
    }

    public String json(List<Shape> shapes) {
        return "{ShapesSum: %s}".formatted(areaCalculator.sum(shapes));
    }

    public String csv(List<Shape> shapes) {
        return "Shapes_sum,%s".formatted(areaCalculator.sum(shapes));
    }

}
