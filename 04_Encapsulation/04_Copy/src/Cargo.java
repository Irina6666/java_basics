public class Cargo {
    private final Dimensions dimensions;
    private final int weight;
    private final String deliveryAddress;
    private final boolean flipPossible;
    private final String registrationNumber;
    private final boolean fragileCargo;

    public Cargo(Dimensions dimensions, int weight, String deliveryAddress, boolean flipPossible, String registrationNumber, boolean fragileCargo){
        this.dimensions = dimensions;
        this.weight = weight;
        this.deliveryAddress = deliveryAddress;
        this.flipPossible = flipPossible;
        this.registrationNumber = registrationNumber;
        this.fragileCargo = fragileCargo;
    }

    public Dimensions getDimensions(){
        return dimensions;
    }

    public Cargo setDimensions(Dimensions dimensions){
        return new Cargo(dimensions, weight, deliveryAddress, flipPossible, registrationNumber, fragileCargo);
    }

    public int getWeight(){
        return weight;
    }

    public Cargo setWeight(int weight){
        return new Cargo(dimensions, weight, deliveryAddress, flipPossible, registrationNumber, fragileCargo);
    }

    public String getDeliveryAddress(){
        return deliveryAddress;
    }

    public Cargo setDeliveryAddress(String deliveryAddress){
        return new Cargo(dimensions, weight, deliveryAddress, flipPossible, registrationNumber, fragileCargo);
    }

    public boolean getFlipPossible(){
        return flipPossible;
    }

    public Cargo setFlipPossible(boolean flipPossible){
        return new Cargo(dimensions, weight, deliveryAddress, flipPossible, registrationNumber, fragileCargo);
    }

    public String getRegistrationNumber(){
        return registrationNumber;
    }

    public Cargo setRegistrationNumber(String registrationNumber){
        return new Cargo(dimensions, weight, deliveryAddress, flipPossible, registrationNumber, fragileCargo);
    }

    public boolean getFragileCargo(){
        return fragileCargo;
    }

    public Cargo setFragileCargo(boolean fragileCargo){
        return new Cargo(dimensions, weight, deliveryAddress, flipPossible, registrationNumber, fragileCargo);
    }

    public String toString(){
        return  dimensions + "\n" + "Вес: " + weight + "\n" + "Адрес: " + deliveryAddress + "\n" + "Регистрационный номер: " + registrationNumber;
    }

}
