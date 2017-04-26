import java.util.ArrayList;
/**
 * Created by bhuvanabellala on 1/20/17.
 *
 * Reverse a string in place
 */
import java.util.ArrayDeque;
public class SandBox {

    public static int missingNumber(int[] nums) {

        int xor = 0, i = 0;
        for (i = 0; i < nums.length; i++) {
            xor = xor ^ i ^ nums[i];
            System.out.println(xor);
        }

        return xor ^ i;
    }

    public static String reverseString(char[] arr){

        for(int i = 0; i < arr.length/2; i++){

            char temp = arr[i];
            arr[i] = arr[arr.length -i - 1];
            arr[arr.length -i - 1] = temp;
        }

        return new String(arr);

    }


    public static void main (String[] args)
    {
//        int [] a = {-2, -3, -4, -1, -2, -1, -5, -3};
//        System.out.println("Maximum contiguous sum is " +
//                maxSubArraySum(a));

        ArrayList<Integer> hel = new ArrayList<>();
        hel.add(null);
        hel.add(31 );
        System.out.println(hel.get(0).equals(hel.get(1)));
    }

//    public boolean isPalindrome(ListNode head) {
//
//        ArrayDeque<Integer> stak = new ArrayDeque<>();
//
//        int count = 0;
//        ListNode temp = head;
//
//        while(temp != null){
//            stak.addLast(temp.val);
//            temp = temp.next;
//        }
//
//        while(!stak.isEmpty()){
//            if(head.val != stak.removeLast()){
//                return false;
//            }
//            head = head.next;
//        }
//
//        return true;
//
//    }

    static int maxSubArraySum(int a[])
    {
        int size = a.length;
        int max_so_far = Integer.MIN_VALUE, max_ending_here = 0;

        int cols, rows = 1;
        for (int i = 0; i < size; i++)
        {
            max_ending_here = max_ending_here + a[i];
            if (max_so_far < max_ending_here)
                max_so_far = max_ending_here;
            if (max_ending_here < 0)
                max_ending_here = 0;
        }
        int c = 3 / 4;
        return max_so_far;


    }
}
