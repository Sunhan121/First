package designPattern.abstractFactory.shape;

/**
 * Created by SUN on 17/7/19.
 */
public class Square implements Shape {
    @Override
    public void draw() {
        System.out.println("Inside Square::draw() method.");
    }
}
