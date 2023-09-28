public class ExampleOneRecordClass {
   public static void main(String[] args) {
        Person person1 = new Person("Raj", 40);
        System.out.println(person1);

        System.out.println("--------------------------");
        System.out.println("Emplyee Name : " + person1.name());
        System.out.println("Employee Age : " + person1.age());

   } 
}


record Person(String name, int age) {
    // No need to declare constructors, getters, equals, hashCode, or toString methods
}

