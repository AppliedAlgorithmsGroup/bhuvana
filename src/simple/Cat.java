package simple;

/**
 * Created by bhuvanabellala on 2/7/17.
 */


public class Cat extends Animal {

    public String noise = "hello";

    public Cat(String name, int age) {

        super(name, age); // Call superclass’ constructor.

       // Change the value of the field.

    }

    @Override

    public void greet() {

        System.out.println("Cat " + name + " says: " + makeNoise());

    }


    public static void main(String[] args) {
//        Animal a = new Animal("Fido", 25);
//        //Dog b = a; //Would not work because of incompatible types
//        Dog b = (Dog) a; //Compiles and runs because a can be cast to a Dog and a’s dynamic type is also dog.
//        Cat c = (Cat) a; //Compiles but you will get a ClassCast

        int R = 1 << 8;
        int mask = R - 1;
        System.out.println(100 %    1000);



    }
}