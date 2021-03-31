package task3;

import java.net.SocketPermission;

public class Main {
    public static void main(String[] args) {
        Ferrari ferrari = new Ferrari("Ferrari Roma", "4*1,5");

        System.out.println(ferrari.getName());
        ferrari.getNumberOfSeats(2);
        ferrari.registrationNumber(7777);
        ferrari.gearChange(1);
        ferrari.steer(1);
        ferrari.move(50, 1);
        ferrari.gearChange(0);
        ferrari.stop();
    }
}
