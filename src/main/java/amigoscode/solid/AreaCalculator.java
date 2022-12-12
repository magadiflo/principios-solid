package amigoscode.solid;

import java.util.List;

public class AreaCalculator {

    public int sum(List<Shape> shapes) {//* shapes: formas
        int sum = 0;
        for (int i = 0; i < shapes.size(); i++) {
            Shape shape = shapes.get(i);
            sum += shape.area();

            // Como ya implementamos una interfaz genérica, nos basamos en ella para poder sumar las áreas
            // y no estar preguntando si es cuadrado, círculo o etc.. para aplicar su fórmula y obtener su área,
            // ya que cada cálculo nos la proporciona la misma clase que implemente shape. De esta manera,
            // cada vez que quisiéramos agregar una nueva Forma (shape) para acumular su área a la suma ya no
            // necesitamos modificar este código. SOLO basta con Implementar la interfaz Shape a la nueva forma
            // para que cumpla el contrato definido y aquí se use su método ...area(). Entonces, de esta manera
            // damos cumplimiento al principio Open/Closed, abierto a la extensión y cerrado a la modificación.

            /*
            if (shape instanceof Square) {
                sum += Math.pow(((Square) shape).getLength(), 2);
            }
            if (shape instanceof Circle) {
                sum += Math.PI * Math.pow(((Circle) shape).getRadius(), 2);
            }
            */
            // Aquí ya se está violando el principio Open/Closed
            // No podemos estar modificando la clase cada vez que agreguemos una nueva forma.
            // Para solucionar eso debemos extender la funcionalidad creando una interfaz genérica
            /*
            if (shape instanceof Cube) {

            }
            */
        }
        return sum;
    }

}
