package interfaces;

public class Rectangle implements Countable, Drawable {
    @Override
    public void draw() {
        System.out.println("Drawing a rectangle.");
    }
    @Override
    public void printInfo() {
        System.out.println("Rectangle Info");
    }
}
