package task3;

public class Ferrari extends Car {

    public Ferrari(String name, String size) {
        super(name, size);
    }

    @Override
    public int getNumberOfSeats(int getNumberOfSeats) {
        if (getNumberOfSeats >= 4) {
            System.out.println("Its not a sport car");
        } else {
            System.out.println("Its a sport car");
        }
        return numberOfSeats;
    }
}

