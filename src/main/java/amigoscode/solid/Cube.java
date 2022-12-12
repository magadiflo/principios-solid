package amigoscode.solid;

public class Cube implements Shape, ThreeDimensionalShape {

    @Override
    public double area() {
        return 100; // imaginemos que es 100 el área de un cubo cualquiera
    }

    @Override
    public double volume() {
        return 0;
    }
}
