package myjava.npp.homework.april1214;

/**
 * Created by Samsung on 22.04.14.
 */
public abstract class Passenger_car extends Car {
    public Passenger_car(){};
    public Passenger_car (int id, String color){
        super(color, id);

    }
    public String toString(){
        return super.toString();
    }
    @Override
    public void ride(){
        System.out.println("I am Passenger car");
    }
}
