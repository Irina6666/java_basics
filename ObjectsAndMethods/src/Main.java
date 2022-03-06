public class Main {

    public static void main(String[] args) {
        Basket basketOne = new Basket(1000);
        basketOne.add("Milk", 40, 1 , 10);
        basketOne.print("Корзина 1");

        Basket basketTwo = new Basket();
        basketTwo.add("Milk", 40, 6, 200);
        basketTwo.add("Water", 20, 3, 100);
        basketTwo.print("Корзина 2");
    }


}
