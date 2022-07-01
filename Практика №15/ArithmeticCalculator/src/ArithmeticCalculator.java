public class ArithmeticCalculator {

    public int numberOne;
    public int numberTwo;


    public ArithmeticCalculator(int numberOne, int numberTwo) {
        this.numberOne = numberOne;
        this.numberTwo = numberTwo;
    }

    public void calculate(Operation operation) {
        switch (operation) {
            case ADD:
                System.out.println(numberOne + numberTwo);
                break;
            case SUBSTRACT:
                System.out.println(numberOne - numberTwo);
                break;
            case MUITIPLY:
                System.out.println(numberOne * numberTwo);
                break;
        }
    }
}
