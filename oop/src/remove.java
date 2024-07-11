import java.util.Arrays;
public class remove {

    public int [] remove (int[] number){

        int[] arr = new int[number.length - 1];

        for(int i=1;i<number.length;i++){
            if(number[i] == number[i - 1]) continue;
            else {
                arr[i] = number[i];
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        remove remove = new remove();

        int [] numbers = {1,1,2,3,3,4};

        int[] result = remove.remove(numbers);


        System.out.println(Arrays.toString(result));

    }
}
