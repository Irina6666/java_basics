public class Keyboard {
    public  String type;
    public KeyboardBacklight backlight;
    public double weight;

    // геттеры
    public String getType() {
        return type;
    }
    public KeyboardBacklight getBacklight() {
        return backlight;
    }
    public double getWeight() {
        return weight;
    }

    //сеттеры
    public void setWeight(double weight) {
        this.weight = weight;
    }
    public void setBacklight(KeyboardBacklight backlight) {
        this.backlight = backlight;
    }
    public void setType(String type) {
        this.type = type;
    }

    public Keyboard(String type, KeyboardBacklight backlight, double weight) {
        this.type = type;
        this.backlight = backlight;
        this.weight =  weight;
    }
    public String toString() {
        return "Экран: \n" +
                "  Тип: " + getType() + "\n" +
                "  Подсветка: " + getBacklight() + "\n" +
                "  Вес: " + getWeight() + "\n"
                ;
    }
}
