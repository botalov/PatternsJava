package CreationalPatterns.FabricMethod.Shapes;

import CreationalPatterns.FabricMethod.ShapeInterface;

public class Cube implements ShapeInterface {
    @Override
    public void printInfo() {
        System.out.println("Cube");
    }
}
