package myjava.npp.homework.april1214;

/**
 * Created by Samsung on 22.04.14.
 */
public class Passenger_carFactory {
    public static Passenger_car createCar(String Passenger_car){
        if(Passenger_car.equals("Passenger_car1"))
            return new Passenger_car1((int)(Math.random()*5 +1),"white");

        else return null;

    }
}
