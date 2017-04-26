package generics;

/**
 * Created by bhuvanabellala on 12/29/16.
 */
public class Box<T> {

    private T _t;

    private T t;

    public void set(T t) {
        this.t = t;
    }

    public T get() {
        return t;
    }

    public <U extends Number> void inspect(U u){
        System.out.println("T: " + t.getClass().getName());
        System.out.println("U: " + u.getClass().getName());
    }

    public static void main(String[] args) {
        Box<Object> integerBox = new Box<>();
        integerBox.set(new SimpleObj());
        integerBox.set("he");
        String s = (String) integerBox.get();
        integerBox.inspect(1); // error: this is still String!
    }

}
