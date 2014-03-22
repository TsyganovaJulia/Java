package ru.kpfu.npp.math;

/**
 * Created by Samsung on 15.03.14.
 */

public class matrixArrayImp implements matrix {
  
    private int[][] matrix; //поле класса
    private static final int MAX_ROWS = 30;
    private static final int MAX_COLUMNS = 30;

    public matrixArrayImp(){
        this.matrix = new int[30][];
        for (int i=0; i< MAX_ROWS; i++){
            this.matrix[i] = new int [MAX_COLUMNS];//инициализировали строки
        }
    }
    //методы доступа
    public int getValue (int row, int column){
        if((row<MAX_ROWS-1)&& (column <MAX_COLUMNS-1)){
        return this.matrix[row][column];
        }
        else throw new IndexOutOfBoundsException();
    }
    public void setValue (int row, int column, int value){
        if((row<MAX_ROWS-1)&& (column <MAX_COLUMNS-1)){
            this.matrix[row][column]=value;
        }
        else throw new IndexOutOfBoundsException();
    }
    public String toString(){
        String str= new String();
        for(int i=0; i<MAX_ROWS; i++){
            for (int j=0; j<MAX_COLUMNS; j++){
                str+=matrix[i][j]+" ";
            }
            str="\n";
        }
        return str;
    }

}
