package classloader;

public class A {

    private B b;

    public void setB(B b) {
        this.b = b;
    }

    public B getB() {
        return b;
    }

    @Override
    public String toString() {
        return "A classloader " + this.getClass().getClassLoader();
    }
}