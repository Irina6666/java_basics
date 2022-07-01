public class Screen {
    public  String diagonal;
    public ScreenType type;
    public double weight;

    // геттеры
    public String getDiagonal() {
        return diagonal;
    }
    public ScreenType getType() {
        return type;
    }

    public double getWeight() {
        return weight;
    }

    //сеттеры
    public void setDiagonal(String diagonal) {
        this.diagonal = diagonal;
    }
    public void setType(ScreenType type) {
        this.type = type;
    }
    public void setWeight(double weight) {
        this.weight = weight;
    }

    public Screen(String diagonal, ScreenType type, double weight) {
        this.diagonal = diagonal;
        this.type = type;
        this.weight = weight;
    }

    public String toString() {
        return "Экран: \n" +
                "  Диагональ: " + getDiagonal() + "\n" +
                "  Тип: " + getType() + "\n" +
                "  Вес: " + getWeight() + "\n"
                ;
    }
}
