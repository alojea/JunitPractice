import junit.framework.TestCase;


public class ArrayMultTest extends TestCase {

    private ArrayMult arrayMult;

    public void setUp(){
        arrayMult = new ArrayMult();
    }

    public void testMult() {

        int[] array1 = {4, 6, 0, 3, 4, 5, 4, 4, 6, 2};
        int[] array2 = {6, 0, 3, 4, 5, 4, 4, 0};
        int[] outArray = {24,0,0,12,20,20,16,0,6,2};
        int[] resultArray = arrayMult.mult(array1,array2);
        for(int i = 0; i < outArray.length; i++) {
            assertEquals(resultArray[i], outArray[i]);
        }

    }
}