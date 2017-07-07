package decorator;

/**
 * Created by Seweryn on 2017-03-13.
 * http://www.journaldev.com/1540/decorator-design-pattern-in-java-example
 */
public class DecoratorPatternTest {

    public static void main(String[] args) {
        Car sportsCar = new SportsCar(new BasicCar());
        sportsCar.assemble();
        System.out.println("\n*****");

        Car sportsLuxuryCar = new SportsCar(new LuxuryCar(new BasicCar()));
        sportsLuxuryCar.assemble();


    }

}
