public final class Car extends VehicleSealed {
    
    public void displayCar() {
        VehicleSealed vehcileSealed = new VehicleSealed();
        vehcileSealed.maker = "Mahindra";
        vehcileSealed.color = "White";
        vehcileSealed.price = 15000.00;
        System.out.println("Maker : " + vehcileSealed.maker);
        System.out.println("Color : " + vehcileSealed.color);
        System.out.println("Price : " + vehcileSealed.price);
        System.out.println("Tax : " + vehcileSealed.calTax(vehcileSealed.price));
    }
}
