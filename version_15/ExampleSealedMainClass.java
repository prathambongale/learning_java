public class ExampleSealedMainClass {

    public static void main(String[] args) {
        System.out.println("ExampleSealedMainClass");

        Car car = new Car();
        car.displayCar();

        Truck truck = new Truck();
        truck.displayTruck();
    }
    
}
