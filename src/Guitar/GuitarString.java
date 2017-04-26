package Guitar;

/**
 * Created by bhuvanabellala on 2/19/17.
 */
public class GuitarString {
    public final int[] rocks;

    /** Constants. Do not change. In case you're curious, the keyword final means
     * the values cannot be changed at runtime. We'll discuss this and other topics
     * in lecture on Friday. */
    private static final int SR = 44100;      // Sampling Rate
    private static final double DECAY = .996; // energy decay factor

    /* Buffer for storing sound data. */
    private BoundedQueue<Double> buffer;

    public GuitarString(double frequency){
        rocks = new int[10];

        int N = (int) Math.round(SR / frequency);

        // set up the buffer of a string at rest
        buffer = new ArrayRingBuffer<Double>(N);
        for (int i = 0; i < N; i++) {
            buffer.enqueue(0.0);
        }
    }

    public void pluck(){
    //rocks = new int[23];
        int N = buffer.capacity();
        // random numbers from -1/2 to +1/2
        for (int i = 0; i < N; i++) {
            double r = Math.random() - 0.5;
            buffer.dequeue();
            buffer.enqueue(r);
        }

    }

    public double sample(){
        return buffer.peek();
    }

    public void tic(){

        double ave = (buffer.dequeue() + buffer.peek()) / 2;
        // apply decay and replace the previously first sample
        buffer.enqueue(ave * DECAY);

    }
}

