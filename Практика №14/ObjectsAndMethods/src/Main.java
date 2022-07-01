public class Main {

    public static void main(String[] args) {
        Basket basketOne = new Basket(1000);
        basketOne.add("Milk", 40, 2 , 10);
        basketOne.print("Корзина 1");

        Basket basketTwo = new Basket();
        basketTwo.add("Milk", 40, 7, 200);
        basketTwo.add("Water", 20, 4, 100);
        basketTwo.print("Корзина 2");

        Basket basket3 = new Basket();
        basket3.add("Milk", 40, 7, 200);
        basket3.add("Water", 20, 4, 100);
        basket3.add("Bread", 15, 2, 350);
        basket3.print("Корзина 3");

        System.out.println("\n" + "Общая сумма всех корзин: " + Basket.getTotalCost());
        System.out.println("Общее количество товаров во всех корзинах: " + Basket.getTotalGods());
        System.out.println("Средняя цена товара во всех корзинах: " + Basket.getAverageProductPrice());
        System.out.println("Средняя стоимость корзины: " + Basket.getAverageCostBasket());
        System.out.println("Общее количество корзин: " + Basket.getCount());
    }
}
