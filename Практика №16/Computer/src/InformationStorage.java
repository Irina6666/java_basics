public class InformationStorage {
    public InformationStorageType type;
    public int volume;
    public double weight;

    // геттеры
    public InformationStorageType getType() {
        return type;
    }
    public int getVolume() {
        return volume;
    }
    public double getWeight() {
        return weight;
    }

    //сеттеры
    public void setType(InformationStorageType type) {
        this.type = type;
    }
    public void setVolume(int volume) {
        this.volume = volume;
    }
    public void setWeight(double weight) {
        this.weight = weight;
    }

    public InformationStorage(InformationStorageType type, int volume, double weight) {
        this.type = type;
        this.volume = volume;
        this.weight = weight;
    }

    public String toString() {
        return "Накопитель информации: \n" +
                "  Тип: " + getType() + "\n" +
                "  Объем: " + getVolume() + "\n" +
                "  Вес: " + getWeight() + "\n"
                ;
    }
}
