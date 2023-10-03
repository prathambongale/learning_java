public class ExampleTwoRecordClass {
    public static void main(String[] args) {

        // Compact Constructure
        var range1 = new Range(10, 100);
        System.out.println("Range1 : value of start " + range1.start() + " and value of end " + range1.end());
        //var range2 = new Range(50, 1);

        // Canonical Constructor
        var rangeTwo1 = new RangeTwo(9, 50);
        System.out.println("RangeTwo1 : value of start " + rangeTwo1.start() + " and value of end " + rangeTwo1.end());
        var rangeTwo2 = new RangeTwo(-1, 101);
        System.out.println("RangeTwo2 : value of start " + rangeTwo2.start() + " and value of end " + rangeTwo2.end());
        var rangeTwo3 = new RangeTwo(200, 87);
    }
}
