package myjava.npp.homework.march2314;

/**
 * Created by Samsung on 28.03.14.
 */
public class Complex implements TrigonometricForm , ComplexActions, ComplexMath{
    private int a;
    private int b;
    public Complex(){
        a=2;
        b=3;
    }
   public Complex(int a, int b){
       this.a=a;
       this.b=b;
   }
public int getA (){
    return this.a;
}
    public int getB(){
        return this.b;

    }

    public double getModule(){
        int z = a*a + b*b;
        return Math.sqrt(z);

    }

  public   double getArg(){
        double z = b/a;
        return Math.tan(z);

    }
    public void conjugate(){
        b=-b;
    }
   public void sum(Complex obj){
        a=a+obj.a;
       b=b+obj.b;
    }
    public void difference(Complex obj){
        a=a-obj.a;
        b=b-obj.b;
    }
   public void productOnNumber(int number){

      a=a*number;
    }



public String toString (){
String str = new String();
    str ="\n" + a + "+ i"+ b + "\n";
    return str;
}
public boolean equals(Complex obj){
    if((a==obj.a)&&(b==obj.b))
        return true;
    else
        return  false;
    }

}

