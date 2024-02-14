import java.util.HashMap;
import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        int [] nums = {1,1,2};
        int [] nums2 = {-3,-1,0,0,0,3,3};




        System.out.println(removeDuplicates(nums));
        System.out.println(removeDuplicates(nums2));
    }
    public static int removeDuplicates(int[] nums) {
        int uniqueNumber = 0;
        int [] uniqueNums;

        HashMap <Integer , Integer> number = new HashMap<> ();

        for (int i = 0 ; i < nums.length ; i++ )
        {
            // put the value from array and the frequency of that key in the hashmap
            number.put(nums[i], number.getOrDefault(nums[i], 0)+1 );
        }
        uniqueNumber = number.size();
        uniqueNums = new int [number.size()];
        int i = 0;


        //put all the values of keys in the nums array
        for (int j : number.keySet()){
            uniqueNums[i] = j;
            i++;

        }


        //assign nums with the uniqueNums after arranging in ascending
        for (int k = 0 ; k < uniqueNums.length-1 ; k++)
        {
            //sort in ascending order
            Arrays.sort(uniqueNums);

            // remove everythin after that
        }
        for (int k = 0 ; k < nums.length ; k++)
        {
            if (k < uniqueNums.length)
            {
                nums[k] = uniqueNums[k];

            }
            else {
                nums[k] = 0;
            }
            //remove everything after the uniqueNums
            // not even 0

        }





        return uniqueNumber;
    }

}