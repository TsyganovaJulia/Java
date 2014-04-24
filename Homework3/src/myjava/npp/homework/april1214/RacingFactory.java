package myjava.npp.homework.april1214;

/**
 * Created by Samsung on 22.04.14.
 */
public class RacingFactory {
    public static Racing createCar(String Racing){
        if(Racing.equals("Racing1"))
            return new Racing1((int)(Math.random()*5 +1), 1,"white");
        else if(Racing.equals("Racing2"))
            return new Racing2((int)(Math.random()*5 +1), 2,"white");
        else return null;

    }
}
