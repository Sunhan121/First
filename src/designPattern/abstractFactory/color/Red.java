package designPattern.abstractFactory.color;

/**
 * Created by SUN on 17/7/19.
 */
public class Red implements Color{
    @Override
    public void fill() {
        System.out.println("Inside Red::fill() method.");
    }
}
