package designPattern.abstractFactory.color;

/**
 * Created by SUN on 17/7/19.
 */
public class Green implements Color{
    @Override
    public void fill() {
        System.out.println("Inside Greent::fill() method.");
    }
}
