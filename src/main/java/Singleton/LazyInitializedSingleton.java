package Singleton;

/**
 * Created by Seweryn on 2017-03-13.
 * http://www.journaldev.com/1377/java-singleton-design-pattern-best-practices-examples
 */
public class LazyInitializedSingleton {

    private static LazyInitializedSingleton instance;

    private LazyInitializedSingleton(){}

    public static LazyInitializedSingleton getInstance(){
        if(instance == null){
            instance = new LazyInitializedSingleton();
        }
        return instance;
    }
}
