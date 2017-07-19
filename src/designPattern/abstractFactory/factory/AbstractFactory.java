package designPattern.abstractFactory.factory;

import designPattern.abstractFactory.color.Color;
import designPattern.abstractFactory.shape.Shape;

/**
 * Created by SUN on 17/7/19.
 */
public abstract class AbstractFactory {
    abstract Color getColor(String color);
    abstract Shape getShape(String shape);
}
