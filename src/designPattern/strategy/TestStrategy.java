package designPattern.strategy;

/**
 * Created by SUN on 17/7/19.
 */
public class TestStrategy {
    public static void main(String[] args) {
        Context context = new Context(new OperationAdd());
        int result = context.executeStrategy(10, 1);
        System.out.println(result);
        // 设置注释
    }
}
