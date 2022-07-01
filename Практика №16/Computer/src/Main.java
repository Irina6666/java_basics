public class Main {
    public static void main(String[] args) {


        Processor processorA = new Processor(55, 11, "ASUS", 1);
        RAM ramA = new RAM(RAMType.DDR2, 500, 2);
        InformationStorage informationStorageA = new InformationStorage(InformationStorageType.SSD, 87, 9);
        Screen screenA = new Screen("3840 х 2160", ScreenType.TN, 100);
        Keyboard keyboardA = new Keyboard("кнопка", KeyboardBacklight.NO, 50);

        Computer computerA = new Computer("Asus", "S300TA-310100024T", processorA, ramA, informationStorageA, screenA, keyboardA);


        Processor processorB = new Processor(70, 15, "Apple", 7);
        RAM ramB = new RAM(RAMType.SDRAM, 400, 9);
        InformationStorage informationStorageB = new InformationStorage(InformationStorageType.HDD, 5, 8);
        Screen screenB = new Screen("1920 х 1080", ScreenType.TN, 100);
        Keyboard keyboardB = new Keyboard("кнопка", KeyboardBacklight.YES, 50);

        Computer computerB = new Computer("Apple", "Mini T678", processorB, ramB, informationStorageB, screenB, keyboardB);


        System.out.println(computerA.toString());
        System.out.println("Общий вес компьютера: " + computerA.totalWeight());

        System.out.println(computerB.toString());
        System.out.println("Общий вес компьютера: " + computerB.totalWeight());

    }
}
