package designPattern.abstractFactory.factory;

import designPattern.abstractFactory.color.Color;
import designPattern.abstractFactory.shape.Circle;
import designPattern.abstractFactory.shape.Rectangle;
import designPattern.abstractFactory.shape.Shape;
import designPattern.abstractFactory.shape.Square;

/**
 * Created by SUN on 17/7/19.
 */
public class ShapeFactory extends AbstractFactory {
    @Override
    public Color getColor(String color) {
        return null;
    }

    @Override
    public Shape getShape(String shape) {
        if (shape == null) {
            return null;
        }
        if (shape.equalsIgnoreCase("CIRCLE")) {
            return new Circle();
        } else if (shape.equalsIgnoreCase("SQUARE")) {
            return new Square();
        } else if (shape.equalsIgnoreCase("RECTANGLE")) {
            return new Rectangle();
        }
        return null;
    }
}
