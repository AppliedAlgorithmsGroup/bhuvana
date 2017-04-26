package simple;
import java.util.LinkedList;
import java.util.List;
import java.util.function.Predicate;

/**
 * Created by bhuvanabellala on 2/8/17.
 */
public class Lambda {


    public static void printPersonsWithPredicate(
            List<Cat> roster, Predicate<Cat> tester) {
        for (Cat p : roster) {
            if (tester.test(p)) {
                //p.greet();
            }
        }
    }

    public static void main(String[] args) {

        List<Cat> roster = new LinkedList<>();
        roster.add(new Cat("Fido", 30));
        roster.add(new Cat("Pluto", 20));

        Predicate<Cat> Tester = p -> p.age >= 18
                && p.age <= 25;

        printPersonsWithPredicate(
                roster,
                Tester
        );

    }

}
