package amigoscode.solid;

import java.util.List;

public class AreaCalculator {

    public int sum(List<Object> shapes) {//* shapes: formas
        int sum = 0;
        for (int i = 0; i < shapes.size(); i++) {
            Object shape = shapes.get(i);
            if (shape instanceof Square) {
                sum += Math.pow(((Square) shape).getLength(), 2);
            }
            if (shape instanceof Circle) {
                sum += Math.PI * Math.pow(((Circle) shape).getRadius(), 2);
            }
        }
        return sum;
    }

    // Violando el principio: Single Responsibility
    // Estamos agregando funcionalidad que no debería corresponderle a esta clase.
    // Para solucionar el problema, creamos una clase que
    // únicamente se encargue de imprimir formatos los distintos formatos (ShapesPrinter)
    /*
    public String json(List<Object> shapes) {
        return "{sum: %s}".formatted(sum(shapes));
    }

    public String csv(List<Object> shapes) {
        return "sum,%s".formatted(sum(shapes));
    }
    */

}
