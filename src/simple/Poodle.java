package simple;

/**
 * Created by bhuvanabellala on 2/14/17.
 */
public class Poodle extends Dog {


    public Poodle(String s, int age){
        super(s, age);
    }

//    public void eat(Poodle p){
//        System.out.println("I am in poodle");
//    }


    public static void main(String[] args) {
        Poodle d4 = new Poodle("Poo", 42);

       Poodle d5 = new Poodle("poo", 4);
        d5.eat(d4);
    }
}
