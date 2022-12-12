package amigoscode.solid;

// Single Responsibility: Se encargará solo de imprimir en diversos formatos
public class ShapesPrinter {

    public String json(int sum) {
        return "{ShapesSum: %s}".formatted(sum);
    }

    public String csv(int sum) {
        return "Shapes_sum,%s".formatted(sum);
    }

}
