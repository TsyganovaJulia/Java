package myjava.npp.homework.march2314;

/**
 * Created by Samsung on 29.03.14.
 */
public class runner {
    public static void  main (String args []){
        Complex obj1, obj2,obj3;
        obj3 = new Complex();
        obj1=new Complex(4,5);
        obj2=new Complex(2,3);
        double z = obj1.getModule();
        obj1.difference(obj2);
        obj3.sum(obj2);
        boolean b = obj1.equals(obj3);
        System.out.println(b);
        System.out.print(z);
        System.getProperty("line.separator");
        String str1 = obj1.toString();
        System.out.print(str1);
        System.getProperty("line.separator");
        String str2=obj3.toString();
        System.out.print(str2);
    }
}
