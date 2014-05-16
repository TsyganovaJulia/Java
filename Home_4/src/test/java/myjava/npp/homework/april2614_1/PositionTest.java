package myjava.npp.homework.april2614_1;

import org.junit.Assert;

/**
 * Created by Samsung on 16.05.14.
 */
public class PositionTest {
    Position position;
    @org.junit.Before
    public void setUp() throws Exception{
        position = new Position(){};

    }
    @org.junit.Test
    public void testFindPosition() throws Exception {
        String word = "bg";

        Assert.assertTrue( position.FindPosition(word) == 5);

    }
}
