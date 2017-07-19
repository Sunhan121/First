package designPattern.abstractFactory.shape;

/**
 * Created by SUN on 17/7/19.
 */
public class Rectangle implements Shape {
    @Override
    public void draw() {
        System.out.println("Inside Rectangle::draw() method.");
    }
}
