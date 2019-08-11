package com.alojea;
import junit.framework.TestCase;
import org.junit.*;

public class ArrayShiftTest extends TestCase {

    private ArrayShift arrayShift;
    private int[] inArray = {4,21,55,2,7};

    public void setUp(){
        arrayShift = new ArrayShift();
    }

    public void testShiftOne(){
        int[] outArray = arrayShift.shiftOne(inArray);
        assertEquals(outArray.length,inArray.length);
        assertEquals(outArray[0], -1);
        for(int i=0;i<inArray.length-1;i++){
            assertEquals(outArray[i+1],inArray[i]);

        }
    }


}
