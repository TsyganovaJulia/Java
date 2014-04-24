package myjava.npp.homework.april1214;

/**
 * Created by Samsung on 22.04.14.
 */
public class Truck1 extends Truck {
    public Truck1(){};
    public Truck1 (int id, String color){
        super(id, color);
    }
    public String toString(){
        return super.toString();
    }
    public void ride(){
        super.ride();
        System.out.println("Truck1");
    }
}
