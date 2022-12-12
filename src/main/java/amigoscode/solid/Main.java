package amigoscode.solid;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        AreaCalculator areaCalculator = new AreaCalculator();
        Circle circle = new Circle(10);
        Square square = new Square(10);
        Cube cube = new Cube();
        Rectangle rectangle = new Rectangle();

        // Violando principio de Substitución de Liskov,
        // el cual nos dice que una Subclase puede ser sustituido por su clase padre,
        // en este caso, nuestra SubClase NoShape() implementa la interfaz Shape,
        // lo que en otras palabras significa que podemos crear una instancia de la
        // SubClase NoShape() a partir de su clase padre Shape, pero como estamos simulando
        // que esta clase NoShape()... por x motivos no queremos usar el método área() (por eso el nombre
        // de NoShape()) pero que en sí implementa dicha interfaz, es que al momento de
        // hacer el cálculo de las áreas el programa se romperá lanzando la excepción definida.
        // Pero como el principio de Substitución de Liskov menciona que sí o sí una Subclase puede
        // ser sustituida por su clase padre, aquí eso no se cumple.
        Shape noShape = new NoShape();

        List<Shape> shapes = List.of(circle, square, cube, rectangle, noShape);
        int sum = areaCalculator.sum(shapes);

        ShapesPrinter printer = new ShapesPrinter();

        System.out.println("sum = " + sum);
        System.out.println(printer.json(sum));
        System.out.println(printer.csv(sum));
    }
}
