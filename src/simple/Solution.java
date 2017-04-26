package simple;
import java.util.HashMap;
/**
 * Created by bhuvanabellala on 3/14/17.
 */
public class Solution {

    public static int guessNumber(int n) {
        int lo = 1;
        int hi = n;
        while(lo <= hi){
            int mid = lo + (hi - lo)/2;
//            System.out.println("hi: " + hi);
//            System.out.println("lo: " + lo);
            int g = guess(mid);
            System.out.println(g);
            if(g == -1){
                hi = mid - 1;
            }else if(g == 1){
                lo = mid + 1;
            }else{
                return mid;
            }

        }

        return -1;
    }

    public static int guess(int n){

        int num = 1702766719;
        if(n < num){
            return 1;
        }else if(n > num){
            return -1;
        }else{
            return 0;
        }
    }

    public static void main(String[] args) {
        //guessNumber(10);
        System.out.println(guessNumber(2126753390));
        HashMap<Integer, int[]> hi = new HashMap<>();
        hi.put(1, new int[]{1,2});
    }


}