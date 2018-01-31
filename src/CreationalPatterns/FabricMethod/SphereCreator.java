package CreationalPatterns.FabricMethod;

import CreationalPatterns.FabricMethod.Shapes.Sphere;

public class SphereCreator extends ShapeCreator {
    @Override
    public ShapeInterface createShape() {
        return new Sphere();
    }
}
