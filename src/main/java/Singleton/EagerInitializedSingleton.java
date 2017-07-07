package Singleton;

/**
 * Created by Seweryn on 2017-03-13.
 * http://www.journaldev.com/1377/java-singleton-design-pattern-best-practices-examples
 */
public class EagerInitializedSingleton {

    private static final EagerInitializedSingleton instance = new EagerInitializedSingleton();

    //private constructor to avoid client applications to use constructor
    private EagerInitializedSingleton(){}

    public static EagerInitializedSingleton getInstance(){
        return instance;
    }
}
