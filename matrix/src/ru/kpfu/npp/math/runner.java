package ru.kpfu.npp.math;

/**
 * Created by Samsung on 15.03.14.
 */

public class runner {
    public static void  main (String args []){
        matrixArrayImp matrix;
        matrix=new matrixArrayImp();
        for (int i=0; i<30; i++){
            for (int j=0; j<30; j++){
                matrix.setValue (i,j,i+j);
            }
        }
        System.out.println(matrix);

    }
}
