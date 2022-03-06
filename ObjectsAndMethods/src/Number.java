public class Number {
    public static void main(String[] args) {
        Arithmetic arithOne = new Arithmetic(8, 4); // объект класса Arithmetic
        System.out.println("Первое число: " + arithOne.getNumOne() + " Второе число: " + arithOne.getNumTwo());
        System.out.println("Сумма чисел: " + arithOne.GetSum());
        System.out.println("Разность чисел: " + arithOne.GetResidual());
        System.out.println("Произведение чисел: " + arithOne.GetMultiplication());
        System.out.println("Среднее значение чисел: " + arithOne.GetAverage());
        System.out.println("Максимальное из двух чисел: " + arithOne.GetMax());
        System.out.println("Минимальное из двух чисел: " + arithOne.GetMin());
    }

    static class Arithmetic {   // класс Arithmetic
        private  float numOne = 0;
        private  float numTwo = 0;

        public Arithmetic (float numOne, float numTwo) { // конструктор Arithmetic
            this.numOne = numOne;
            this.numTwo = numTwo;
            this.numTwo = numTwo;
        }

        public float getNumOne() {
            return numOne;
        }

        public float getNumTwo() {
            return numTwo;
        }

        public float GetSum() {
            return this.numOne + this.numTwo;
        }

        public float GetResidual() {
            return this.numOne - this.numTwo;
        }

        public float GetMultiplication() {
            return this.numOne * this.numTwo;
        }

        public float GetAverage() {
            return (this.numOne + this.numTwo) / 2;
        }

        public float GetMax() {
            if (this.numOne > this.numTwo) {
                return this.numOne;}
            else {return this.numTwo;}
        }

        public float GetMin() {
            if (this.numOne < this.numTwo) {
                return this.numOne;}
            else {return this.numTwo;}
        }
    }
}
