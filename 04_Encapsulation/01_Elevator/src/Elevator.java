public class Elevator {
    private static int currentFloor = 1;
    private static int minFloor;
    private static int maxFloor;

    public Elevator (int minFloor, int maxFloor){
        this.minFloor = minFloor;
        this.maxFloor = maxFloor;
    }
    public static int getCurrentFloor() {return currentFloor;}

    public static void moveDown() {
        currentFloor = currentFloor - 1;
        }

    public static void moveUp() {
        currentFloor = currentFloor + 1;
        }

    public static void move(int floor) {
        getCurrentFloor();

        if (minFloor > floor || maxFloor < floor){
            System.out.println("Этаж выбран не верно");
        }
        else {
            while (currentFloor > floor){
                moveDown();
                getCurrentFloor();
                System.out.println(currentFloor + " этаж");
            }
            while (currentFloor < floor){
                moveUp();
                getCurrentFloor();
                System.out.println(currentFloor + " этаж");
            }

        }
    }
}
