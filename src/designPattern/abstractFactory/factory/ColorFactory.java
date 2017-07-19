package designPattern.abstractFactory.factory;

import designPattern.abstractFactory.color.Blue;
import designPattern.abstractFactory.color.Color;
import designPattern.abstractFactory.color.Green;
import designPattern.abstractFactory.color.Red;
import designPattern.abstractFactory.shape.Shape;

/**
 * Created by SUN on 17/7/19.
 */
public class ColorFactory extends AbstractFactory {
    @Override
    public Shape getShape(String shape) {
        return null;
    }

    @Override
    public Color getColor(String color) {
        if (color == null) {
            return null;
        }
        if (color.equalsIgnoreCase("RED")) {
            return new Red();
        } else if (color.equalsIgnoreCase("BLUE")) {
            return new Blue();
        } else if (color.equalsIgnoreCase("GREEN")) {
            return new Green();
        }
        return null;
    }
}
