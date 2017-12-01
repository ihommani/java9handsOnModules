package publicclasses;

// since the package is not exposed in the module, we won't be able to do it even if the module is required by another.
public class PublicClass {

    public void printHello(){
        System.out.println("Hello");
    }
}
