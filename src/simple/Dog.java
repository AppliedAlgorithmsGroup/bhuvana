package simple;

/**
 * Created by bhuvanabellala on 2/7/17.
 */
public class Dog extends Animal {

    public Dog(String name, int age) {

        super(name, age);

        noise = "Woof!";
    }




    @Override
    public void greet() {

        System.out.println("Dog " + name + " says: " + makeNoise());
    }


//    public void eat(Poodle p){
//        System.out.println("I am in dog");
//    }


    public void eat(Dog p){
        System.out.println("I am in dog and static dog");
    }



    public void playFetch() {

         System.out.println("Fetch, " + name + "!");


    }
}


