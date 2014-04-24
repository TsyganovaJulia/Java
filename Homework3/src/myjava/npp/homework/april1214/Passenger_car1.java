package myjava.npp.homework.april1214;

/**
 * Created by Samsung on 22.04.14.
 */
public class Passenger_car1 extends Passenger_car {
    public Passenger_car1(){};
    public Passenger_car1 (int id, String color){
        super(id, color);
    }
    public String toString(){
        return super.toString();
    }
    public void ride(){
        super.ride();
        System.out.println("Passenger Car1");
    }
}
