package myjava.npp.homework.april1214;

/**
 * Created by Samsung on 22.04.14.
 */
public class Racing1 extends Racing {
    public Racing1(){};

    public Racing1 (int id, int speed, String color){
        super(speed, id, color);
    }
    public String toString(){
        return super.toString();
    }
    public void ride(){
        super.ride();
        System.out.println("Racing1");
    }



}
