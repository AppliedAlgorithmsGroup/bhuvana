package DynamicProgramming;

import java.util.*;

/**
 * Christy is interning at HackerRank. One day she has to distribute some chocolates to her colleagues.
 * She is biased towards her friends and may have distributed the chocolates unequally.
 * One of the program managers gets to know this and orders Christy to make sure everyone gets equal number of chocolates.
 * But to make things difficult for the intern, she is ordered to equalize the number of chocolates for every colleague in the following manner,
 * For every operation, she can choose one of her colleagues and can do one of the three things.
 * She can give one chocolate to every colleague other than chosen one.
 * She can give two chocolates to every colleague other than chosen one.
 * She can give five chocolates to every colleague other than chosen one.
 * Calculate minimum number of such operations needed to ensure that every colleague has the same number of chocolates.
 */


public class Equals {

    public static int findMin(int[] arr){

        int min = Integer.MAX_VALUE;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] < min){
                min = arr[i];
            }
        }

        return min;
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);
        int tests = scan.nextInt();


        for(int testCase = 0; testCase < tests; testCase++){

            int n = scan.nextInt();
            int[] choc = new int[n];
            for(int i = 0; i <  n ; i++){
                choc[i] = scan.nextInt();
            }

            int min = findMin(choc);
            int minChanges = Integer.MAX_VALUE;

            for(int base = 0; base < 5; base++){

                int changes = 0;
                for(int i = 0; i < n; i++){
                    int diff = choc[i] - (min - base);
                    changes += (diff/5) + ((diff%5)/2) + ((diff%5)%2);
                }

                minChanges = changes > minChanges ? minChanges: changes;

            }

            System.out.println(minChanges);


        }


    }
}