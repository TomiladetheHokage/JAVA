import java.util.*;
public class arr {

   // boolean [] arrayOfBooleans = new boolean[2];

//public static void main(String[] args) {
//    arr arr = new arr();
//    int [] numbers = {4,5};
//    boolean [] result = arr.convert(numbers);
//
//    System.out.println(Arrays.toString(result));
//    System.out.println(arr.getArr(result));
//}
    public static boolean[] convert (int[] input){
        boolean [] arrayOfBooleans = new boolean[input.length];

        for(int i = 0; i < input.length; i++){
            if(input[i] % 2 == 0){
                arrayOfBooleans[i] = true;
            }
            //arrayOfBooleans[i] = false;
        }
        return arrayOfBooleans;
    }

    public String  getArr (boolean [] arrayOfBooleans){
          String result =  Arrays.toString(arrayOfBooleans);
          return result;
    }
}
