public class Main {
    public static void main(String[] args) {
        ArithmeticCalculator arithmeticCalculator = new ArithmeticCalculator(1, 2);
        arithmeticCalculator.calculate(Operation.ADD);
        arithmeticCalculator.calculate(Operation.SUBSTRACT);
        arithmeticCalculator.calculate(Operation.MUITIPLY);
    }
}
