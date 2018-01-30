package CreationalPatterns.AbstarctFactory;

import CreationalPatterns.AbstarctFactory.Shapes.Cube;
import CreationalPatterns.AbstarctFactory.Shapes.Sphere;

public interface ShapeFactory {
    public Cube CreateCube();
    public Sphere CreateSphere();
}
