package myjava.npp.homework.april1214;

/**
 * Created by Samsung on 22.04.14.
 */
public class TruckFactory {
    public static Truck createCar(String Truck){
        if(Truck.equals("Truck1"))
            return new Truck1((int)(Math.random()*5 +1),"white");

        else return null;

    }
}
