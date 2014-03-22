package ru.kpfu.npp.math;

/**
 * Created by Samsung on 15.03.14.
 */
public interface matrix {
    int MAX_ROWS = 30;
    int MAX_COLUMNS = 30;

    public int getValue(int row, int column);
    public void setValue (int  row, int column, int value);
    //public String toString();





}
