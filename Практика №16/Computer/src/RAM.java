public class RAM {
    public RAMType type;
    public int volume;
    public double weight;

    // геттеры
    public int getVolume() {
        return volume;
    }
    public double getWeight() {
        return weight;
    }
    public RAMType getType(){
        return type;
    }

    //сеттеры
    public void setType(RAMType type) {
        this.type = type;
    }
    public void setVolume(int volume) {
        this.volume = volume;
    }
    public void setWeight(double weight) {
        this.weight = weight;
    }

    public RAM (RAMType type, int volume, double weight){
        this.type = type;
        this.volume = volume;
        this.weight = weight;
    }
    public String toString() {
        return "Оперативная память: \n" +
                "  Тип: " + getType() + "\n" +
                "  Объем: " + getVolume() + "\n" +
                "  Вес: " + getWeight() + "\n"
                ;
    }


}
