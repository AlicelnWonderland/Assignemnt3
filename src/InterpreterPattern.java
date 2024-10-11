public class InterpreterPattern {
    public static void main(String[] args) {
        Expression five = new NumberExpression(5);
        Expression ten = new NumberExpression(10);
        Expression three = new NumberExpression(3);

        Expression add = new AddExpression(five, ten);
        Expression subtract = new SubtractExpression(add, three);

        System.out.println("Result: " + subtract.interpret());
    }
}