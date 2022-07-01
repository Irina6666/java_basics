public class Computer {

    private Processor processor;
    private RAM ram;
    private InformationStorage informationStorage;
    private Screen screen;
    private Keyboard keyboard;
    private double totalWeight = 0;
    final String vendor;
    final String name;

    public Computer (String vendor, String name, Processor processor, RAM ram, InformationStorage informationStorage, Screen screen, Keyboard keyboard){
        this.vendor = vendor;
        this.name = name;
        this.processor = processor;
        this.ram = ram;
        this.informationStorage = informationStorage;
        this.screen = screen;
        this.keyboard = keyboard;
    }

    // геттеры
    public Processor getProcessor() {
        return processor;
    }
    public RAM getRam() {
        return ram;
    }
    public InformationStorage getInformationStorage() {
        return informationStorage;
    }
    public Keyboard getKeyboard() {return keyboard;}

    public Screen getScreen() {
        return screen;
    }

    public String getVendor() {
        return vendor;
    }
    public String getName() {
        return name;
    }
    public double getTotalWeight() {
        return totalWeight;
    }


    // сеттеры
    public void setTotalWeight(double totalWeight) {
        this.totalWeight = totalWeight;
    }

    public double totalWeight() {
        totalWeight = processor.getWeight() + ram.getWeight() + informationStorage.getWeight() + screen.getWeight() + keyboard.getWeight();
        return totalWeight;
    }

    public String toString() {
        return "Компьютер:\n" +
                "  Производитель ПК: " + vendor + "\n" +
                "  Название ПК: " + name + "\n" + processor.toString() + ram.toString() + informationStorage.toString() + screen.toString() + keyboard.toString()
                ;
    }

}
