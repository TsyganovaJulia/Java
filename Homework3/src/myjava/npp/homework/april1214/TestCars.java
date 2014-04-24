package myjava.npp.homework.april1214;

/**
 * Created by Samsung on 22.04.14.
 */
import java.util.Scanner;
public class TestCars {
    public static void main(String[] args) {
        AutomobileSalon salon = new AutomobileSalon();
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите целое число от 1 до 5: ");

        int id = scan.nextInt();


        salon.printCars(salon.findCarsById(id));
    }
}
