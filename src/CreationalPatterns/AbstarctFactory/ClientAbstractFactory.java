package CreationalPatterns.AbstarctFactory;

import CreationalPatterns.AbstarctFactory.Shapes.Cube;
import CreationalPatterns.AbstarctFactory.Shapes.Sphere;

public class ClientAbstractFactory {
    private ShapeFactory factory;
    public ClientAbstractFactory(ShapeFactory shapeFactory){
        factory = shapeFactory;
    };

    public Cube CreateCube(){
        return factory.CreateCube();
    }
    public Sphere CreateSphere(){
        return factory.CreateSphere();
    }
}
