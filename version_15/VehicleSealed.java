public sealed class VehicleSealed permits Car, Truck{

    public String color;
    public String maker;
    public double price; 

    public double calTax(double price) { return 0.18 * price; }
    
}
