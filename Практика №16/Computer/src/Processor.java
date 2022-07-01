public class Processor {
    private int frequency; //частота
    private int numberCores;
    private String manufacturer; //производитель
    private double weight;

    // геттеры
    public int getFrequency() {
        return frequency;
    }
    public int getNumberCores() {
        return numberCores;
    }
    public String getManufacturer() {
        return manufacturer;
    }
    public double getWeight() {
        return weight;
    }

    //сеттеры
    public void setFrequency(int frequency) {
        this.frequency = frequency;
    }
    public void setNumberCores(int numberCores) {
        this.numberCores = numberCores;
    }
    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }
    public void setWeight(double weight) {
        this.weight = weight;
    }

    public Processor (int frequency, int numberCores, String manufacturer, double weight){
        this.frequency = frequency;
        this.numberCores = numberCores;
        this.manufacturer = manufacturer;
        this.weight = weight;
    }

    public String toString() {
        return "Процессор:\n" +
                "  Часота: " + getFrequency() + "\n" +
                "  Количество ядер: " + getNumberCores() + "\n" +
                "  Производитель: " + getManufacturer() + "\n" +
                "  Вес: " + getWeight() + "\n"
                ;
    }
}
