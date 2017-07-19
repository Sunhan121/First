package designPattern.strategy;

/**
 * Created by SUN on 17/7/19.
 */
public class OperationSubstract implements Strategy {
    @Override
    public int doOperation(int num1, int num2) {
        return num1 - num2;
    }
}
