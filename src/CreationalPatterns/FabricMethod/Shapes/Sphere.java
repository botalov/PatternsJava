package CreationalPatterns.FabricMethod.Shapes;

import CreationalPatterns.FabricMethod.ShapeInterface;

public class Sphere implements ShapeInterface {
    @Override
    public void printInfo() {
        System.out.println("Sphere");
    }
}
