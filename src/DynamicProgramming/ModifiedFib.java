package DynamicProgramming;

import java.util.*;
import java.math.*;

/**
 * Created by bhuvanabellala on 2/17/17.
 */
public class ModifiedFib {


    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */

        Scanner scan = new Scanner(System.in);
        BigInteger t1 = BigInteger.valueOf(scan.nextLong());
        BigInteger t2 = BigInteger.valueOf(scan.nextLong());
        int n = scan.nextInt();
        BigInteger result = BigInteger.valueOf(0);

        if (n == 0) {
            System.out.println(t2);
        }

        if (n == 1) {
            System.out.println(t1);
        }
        for (int i = 2; i < n; i++) {
            result = t1.add(t2.multiply(t2));
            t1 = t2;
            t2 = result;
        }

        System.out.println(result);

    }
}

