package abstract_factory;

/**
 * Created by Seweryn on 2017-03-13.
 */
public class ComputerFactory {

    public static Computer getComputer(ComputerAbstractFactory factory){
        return factory.createComputer();
    }
}
