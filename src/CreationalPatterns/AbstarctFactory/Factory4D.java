package CreationalPatterns.AbstarctFactory;

import CreationalPatterns.AbstarctFactory.Shapes.Cube;
import CreationalPatterns.AbstarctFactory.Shapes.Cube4D;
import CreationalPatterns.AbstarctFactory.Shapes.Sphere;
import CreationalPatterns.AbstarctFactory.Shapes.Sphere4D;

public class Factory4D implements ShapeFactory {
    @Override
    public Cube CreateCube() {
        return new Cube4D();
    }

    @Override
    public Sphere CreateSphere() {
        return new Sphere4D();
    }
}
