package abstract_factory;

/**
 * Created by Seweryn on 2017-03-13.
 * http://www.journaldev.com/1418/abstract-factory-design-pattern-in-java
 */

public class AbstractFactoryPatternTest {

    public static void main(String[] args) {
        testAbstractFactory();
    }

    private static void testAbstractFactory() {
        Computer pc = ComputerFactory.getComputer(new PCFactory("2 GB","500 GB","2.4 GHz"));
        Computer server = ComputerFactory.getComputer(new ServerFactory("16 GB","1 TB","2.9 GHz"));
        System.out.println("AbstractFactory PC Config::"+pc);
        System.out.println("AbstractFactory Server Config::"+server);
    }
}