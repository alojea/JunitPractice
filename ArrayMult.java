public class ArrayMult {
    public int[] mult(int[] array1, int[] array2) {
        int minLength = array1.length;
        int longArrayLength = array1.length;
        int longArray[] = new int[0];

        if(minLength > array2.length){
            minLength = array2.length;
            longArray = array1.clone();
        }else if(array2.length > array1.length){
            longArrayLength = array2.length;
            longArray = array2.clone();
        }

        int[] outArray = new int[longArrayLength];

        for(int i = 0; i<minLength; i++){
            outArray[i] = array1[i] * array2[i];
        }

        if(longArrayLength != 0){
            for(int i = minLength; i< longArrayLength; i++){
                outArray[i] = longArray[i];
            }
        }
        return outArray;
    }
}
