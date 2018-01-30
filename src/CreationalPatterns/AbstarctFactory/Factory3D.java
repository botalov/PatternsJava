package CreationalPatterns.AbstarctFactory;

import CreationalPatterns.AbstarctFactory.Shapes.Cube;
import CreationalPatterns.AbstarctFactory.Shapes.Cube3D;
import CreationalPatterns.AbstarctFactory.Shapes.Sphere;
import CreationalPatterns.AbstarctFactory.Shapes.Sphere3D;

public class Factory3D implements ShapeFactory {
    public Cube CreateCube(){
        return new Cube3D();
    }

    @Override
    public Sphere CreateSphere() {
        return new Sphere3D();
    }

    ;
}
