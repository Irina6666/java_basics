public class Сlothes {
    public static void main(String[] args) {
        Dress dress1 = new Dress(42, 100);
        System.out.println("Размер: " + dress1.dressSize + " Длинна юбки: " + dress1.skirtLength + " цвет: " + dress1.dressColor);

        Dress dress2 = new Dress(44, 30, "red");
        System.out.println("Размер: " + dress2.dressSize + " Длинна юбки: " + dress2.skirtLength + " цвет: " + dress2.dressColor);
    }

    static class Dress {
        private int dressSize;
        private int skirtLength;
        private String dressColor;

        public Dress(int dressSize, int skirtLength) {
            this.dressSize = dressSize;
            this.skirtLength = skirtLength;
        }

        public Dress(int dressSize, int skirtLength, String dressColor) {
            this(dressSize, skirtLength);
            this.dressColor = dressColor;
        }

        public void setDressSize(int dressSize) {
            this.dressSize = dressSize;
        }
        public int getDressSize() {
            return dressSize;
        }

        public void setSkirtLength(int skirtLength) {
            this.skirtLength = skirtLength;
        }
        public int getSkirtLength() {
            return skirtLength;
        }

        public void setDressColor(String dressColor) {
            this.dressColor = dressColor;
        }
        public String getDressColor() {
            return dressColor;
        }

    }
}
