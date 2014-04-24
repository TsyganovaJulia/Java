package myjava.npp.homework.april1214;

/**
 * Created by Samsung on 22.04.14.
 */
public abstract class  Racing extends Car {
   public int speed;
    public Racing(){};
    public Racing (int speed, int id, String color){
        super(color, id);
        this.speed = speed;
      }
    public String toString(){
        return  super.toString() + "My speed -" + this.speed + "\n";

    }
    @Override
    public void ride(){
        System.out.println("I am Racing Car");

    }




}
