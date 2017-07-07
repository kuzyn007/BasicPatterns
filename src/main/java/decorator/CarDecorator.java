package decorator;

/**
 * Created by Seweryn on 2017-03-13.
 */
public class CarDecorator implements Car {

    protected Car car;

    public CarDecorator(Car c){
        this.car=c;
    }

    public void assemble() {
        this.car.assemble();
    }

}
