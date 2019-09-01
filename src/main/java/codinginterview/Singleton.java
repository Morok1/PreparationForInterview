package codinginterview;
/*Please design and implement a class of which we can only create a single instance. */

public class Singleton {
    private Singleton(){}
    private static Singleton INSTANCE = null;

    public Singleton getINSTANCE(){
        if(INSTANCE == null){
            synchronized (this){
                INSTANCE = new Singleton();
            }

        }
        return INSTANCE;
    }
}
