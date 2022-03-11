public class Main {
    public static void main(String[] args) {
        Dimensions dimensions = new Dimensions(2, 3, 4);
        dimensions = dimensions.setWidth(7);
        dimensions = dimensions.setHeight(4);
        dimensions  = dimensions.setLength(10);

        Cargo cargo = new Cargo(dimensions, 8, "Moscow, Lenin str., 5", true, "1235qwe", false);
        cargo = cargo.setWeight(60);
        cargo = cargo.setDeliveryAddress("Saransk, Rabochaya str., 77");
        cargo = cargo.setDimensions(dimensions);

        System.out.println(cargo);

    }
}
