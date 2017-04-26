package simple;

import java.util.HashSet;

/**
 * Created by bhuvanabellala on 3/13/17.
 */
public class TowersofHanoi {

    public static int[] duplicates(int[] arr, int num){


        HashSet<Integer> result = new HashSet<>();
        for(int i: arr){

            if(result.contains(num - i)){
                return new int[]{num - i, i};
            }else{
                result.add(i);
            }

        }

        return null;


    }

    public static void main(String[] args) {


        int[] result = duplicates(new int[]{3,2,1,4,5}, 6);
        System.out.println(result[0] + " " + result[1]);
    }
}
