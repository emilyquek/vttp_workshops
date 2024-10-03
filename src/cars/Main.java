package cars;

// import cars.Car;

public class Main { 

    public static void main(String[] args) {
        
        // creating an instance of the class -- instantiation
        // myCar is an instance of Car
        Car myCar = new Car("toyota");
        myCar.setOwner("fred");
        myCar.info();

        Car yourCar = new Car("nissan, red");
        yourCar.setOwner("barney");
        yourCar.info();

        Car ourCar = new Car();
        ourCar.setMake("bmw");
        ourCar.setOwner("wilma");
        ourCar.info();

        Car batCar = new Car();
        batCar.setOwner("bruce wayne");
        batCar.info();

        batCar.fuelGauge();
        batCar.go();
        batCar.fuelGauge();
        batCar.go(3, true);
        batCar.fuelGauge();

        // car trailer for 6 cars
         Car[] trailer = new Car[6];
         trailer[0] = myCar;

        

    }
    
}
