package CreationalPatterns.FabricMethod;

public abstract class ShapeCreator {

    public void GetInfoAboutShape() {
        ShapeInterface shape = createShape();
        shape.printInfo();
    }

    public abstract ShapeInterface createShape();
}