public final class Truck extends VehicleSealed {

    public void displayTruck() {
        VehicleSealed vehcileSealed = new VehicleSealed();
        vehcileSealed.maker = "Tata";
        vehcileSealed.color = "Green";
        vehcileSealed.price = 4015000.00;
        System.out.println("Maker : " + vehcileSealed.maker);
        System.out.println("Color : " + vehcileSealed.color);
        System.out.println("Price : " + vehcileSealed.price);
        System.out.println("Tax : " + vehcileSealed.calTax(vehcileSealed.price));
    }
    
}
