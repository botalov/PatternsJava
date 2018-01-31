import CreationalPatterns.AbstarctFactory.ClientAbstractFactory;
import CreationalPatterns.AbstarctFactory.Factory3D;
import CreationalPatterns.AbstarctFactory.Factory4D;
import CreationalPatterns.AbstarctFactory.Shapes.Cube;
import CreationalPatterns.AbstarctFactory.Shapes.Sphere;
import CreationalPatterns.FabricMethod.ClientFactoryMethod;
import CreationalPatterns.Singleton.Singlton;

public class Main {

    public static void main(String[] args) {
        System.out.println("Test Singlton");
        Singlton singleton = Singlton.GetInstance();
        singleton.TestMethod();


        /*
        Abstract factory
         */
        System.out.println();
        System.out.println();
        System.out.println("Test abstract factory");
        Cube cube;
        Sphere sphere;

        ClientAbstractFactory clientAbstractFactory = new ClientAbstractFactory(new Factory3D());
        cube = clientAbstractFactory.CreateCube();
        cube.PrintInfo();
        sphere = clientAbstractFactory.CreateSphere();
        sphere.PrintInfo();

        clientAbstractFactory = new ClientAbstractFactory(new Factory4D());
        cube = clientAbstractFactory.CreateCube();
        cube.PrintInfo();
        sphere = clientAbstractFactory.CreateSphere();
        sphere.PrintInfo();

        /*
        Fabric Method
         */
        System.out.println();
        System.out.println();
        System.out.println("Test Fabric Method");
        ClientFactoryMethod.GetInfo();



    }
}
