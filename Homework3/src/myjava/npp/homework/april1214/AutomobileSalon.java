package myjava.npp.homework.april1214;

/**
 * Created by Samsung on 22.04.14.
 */
import java.util.ArrayList;
public class AutomobileSalon {
    ArrayList<Racing1> racing1 = new ArrayList<Racing1>();
    ArrayList<Racing2> racing2 = new ArrayList<Racing2>();
    ArrayList<Truck1> trucks1 = new ArrayList<Truck1>();
    ArrayList<Passenger_car1> passenger_car1 = new ArrayList<Passenger_car1>();

    public AutomobileSalon()
    {
        for (int i=0; i<5; i++)
        {
            racing1.add((Racing1)RacingFactory.createCar("Racing1"));
            racing2.add((Racing2)RacingFactory.createCar("Racing2"));
            trucks1.add((Truck1)TruckFactory.createCar("Truck1"));
            passenger_car1.add((Passenger_car1) Passenger_carFactory.createCar("Passenger_car1"));
        }
    }

    public ArrayList<Car> findCarsById(int id)
    {
        ArrayList<Car> cars = new ArrayList<Car>();
        for (Racing temp:racing1)
        {
            if (temp.getId()==id) cars.add(temp);
        }
        for (Racing temp:racing2)
        {
            if (temp.getId()==id) cars.add(temp);
        }
        for (Truck temp:trucks1)
        {
            if (temp.getId()==id) cars.add(temp);
        }
        for (Passenger_car temp:passenger_car1)
        {
            if (temp.getId()==id) cars.add(temp);
        }
        return cars;
    }
    public void printCars(ArrayList<Car> cars)
    {
        for (Car temp:cars)
        {
            System.out.println(temp);
        }
    }

}
