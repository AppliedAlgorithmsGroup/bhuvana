package nested;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.ArrayList;

/**
 * Created by bhuvanabellala on 12/30/16.
 */
public class ComparisonProvider {
    public int compareByName(Integer a, Integer b) {
        return 0;
    }

    public int compareByAge(Integer a, Integer b) {
        return b.compareTo(a);
    }

    //get list of square of distinct numbers
    public static List<Integer> getSquares(List<Integer> numbers){
        List<Integer> result = new ArrayList<>();
        return result;
    }



    public static void main(String[] args){

//        List<Integer> numbers = Arrays.asList(3, 2, 2, 3, 7, 3, 5);
//        List<Integer> squaresList = getSquares(numbers);
//        System.out.println("Squares List: " + squaresList);
        Integer i = 2389;
        Integer x = 2389;
        System.out.println(i == x);


    }
}

