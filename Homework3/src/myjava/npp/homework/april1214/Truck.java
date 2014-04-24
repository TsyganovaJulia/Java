package myjava.npp.homework.april1214;

/**
 * Created by Samsung on 22.04.14.
 */
public abstract class Truck  extends Car{
    public Truck (){};
    public Truck (int id, String color){
        super(color, id);
        }
    public String toString(){
        return super.toString();
    }
    @Override
    public void ride(){
        System.out.println("I am Truck");

    }


}
