package CreationalPatterns.FabricMethod;

import CreationalPatterns.FabricMethod.Shapes.Cube;

public class CubeCreator extends ShapeCreator {
    @Override
    public ShapeInterface createShape() {
        return new Cube();
    }
}
