package task3;

public abstract class Car extends Vehicle {
    public int numberOfSeats;
    int numberOfDoors;
    int registrationNumber;

    public Car(String name, String size) {
        super(name, size);
    }




     public void registrationNumber (int registrationNumber) {
         if (registrationNumber == 7777) {
             System.out.println("You are lucky!");
         } else {
             System.out.println("Not lucky");
         }
     }


    public void gearChange(int gear) {
        switch (gear) {
            case 1:
                System.out.println("First gear");
                break;
            case 2:
                System.out.println("Second gear");
                break;
            default:
                System.out.println("Gear is not chosen");
                break;
        }
    }




    public abstract int getNumberOfSeats(int getNumberOfSeats);
}
