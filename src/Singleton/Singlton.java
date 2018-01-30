package Singleton;

public class Singlton {
    private Singlton(){
    };

    private static Singlton instance;

    public static Singlton GetInstance(){
        if(instance == null){
            instance = new Singlton();
        }

        return instance;
    }

    public void TestMethod(){
        System.out.println("SINGLTON!");
    }
}
