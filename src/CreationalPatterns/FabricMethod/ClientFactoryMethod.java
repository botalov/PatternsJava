package CreationalPatterns.FabricMethod;

public class ClientFactoryMethod {

    public static void GetInfo() {
        ShapeCreator creator = new CubeCreator();
        creator.GetInfoAboutShape();

        creator = new SphereCreator();
        creator.GetInfoAboutShape();
    }
}
