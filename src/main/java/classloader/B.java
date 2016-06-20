package classloader;

public class B {
    @Override
    public String toString() {
        return "classloader of B " + this.getClass().getClassLoader();
    }
}