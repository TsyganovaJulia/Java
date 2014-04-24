package myjava.npp.homework.april1214;

/**
 * Created by Samsung on 22.04.14.
 */
public class Racing2 extends Racing {
    public Racing2(){};
    public Racing2 (int id, int speed, String color){
        super(speed, id, color);
    }
    public String toString(){
        return super.toString();
    }
    public void ride(){
        super.ride();
        System.out.println("Racing2");
    }
}
