package designPattern.abstractFactory.factory;

import designPattern.abstractFactory.color.Color;
import designPattern.abstractFactory.shape.Shape;

/**
 * Created by SUN on 17/7/19.
 */
public class FactoryProducer {
    public static AbstractFactory getFactory(String choice) {
        if ("SHAPE".equalsIgnoreCase(choice)) {
            return new ShapeFactory();
        } else if ("COLOR".equalsIgnoreCase(choice)) {
            return new ColorFactory();
        }
        return null;
    }

    public static void main(String[] args) {
        AbstractFactory shapeFactory = FactoryProducer.getFactory("shape");
        Shape rectangle = shapeFactory.getShape("rectangle");
        rectangle.draw();

        AbstractFactory colorFactory = FactoryProducer.getFactory("color");
        Color red = colorFactory.getColor("red");
        red.fill();
    }
}
