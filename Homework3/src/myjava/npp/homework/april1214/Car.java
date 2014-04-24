package myjava.npp.homework.april1214;

/**
 * Created by Samsung on 22.04.14.
 */
public abstract class  Car implements Rideable{
  private   String color;
  private int id;
    public Car(){};
    public Car (String CarColor, int CarId){
        this.color = CarColor;
        this.id = CarId;
    }
    public String getColor(){
        return this.color;
    }
    public void setColor(String color){
        this.color = color;
    }
    public int getId(){
        return this.id;
    }
    public  void setId(int id){
        this.id = id;
    }
    public String toString (){
        String str = new String();
        str = "I am car. My color -" + this.color +". "+ "My id -" + this.id +". "+ "\n";
        return str;
    }


}
