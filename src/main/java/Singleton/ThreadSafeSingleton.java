package Singleton;

/**
 * Created by Seweryn on 2017-03-13.
 * http://www.journaldev.com/1377/java-singleton-design-pattern-best-practices-examples
 */
public class ThreadSafeSingleton {

    private static ThreadSafeSingleton instance;

    private ThreadSafeSingleton(){}

    /*public static synchronized ThreadSafeSingleton getInstance(){
        if(instance == null){
            instance = new ThreadSafeSingleton();
        }
        return instance;
    }*/

    //Faster thread safe singleton than above (double check is faster than synchronized method!)
    public static ThreadSafeSingleton getInstanceUsingDoubleLocking(){
        if(instance == null){
            synchronized (ThreadSafeSingleton.class) {
                if(instance == null){
                    instance = new ThreadSafeSingleton();
                }
            }
        }
        return instance;
    }

}
