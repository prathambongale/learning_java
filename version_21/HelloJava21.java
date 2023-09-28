/**
 * HelloJava21
 */
//public class HelloJava21 {

    void main() throws ClassNotFoundException{
        var console = System.console();
        String className = console.readLine("Enter your name ");
        System.out.println("Welcome to the world of Java 21 " + className);

        String i = "";
        var pi = "3141592653589793".chars()
            .map(i -> i - '0')
            .boxed().collect(Collectors.toList());
    System.out.println(pi);
    }
//}

// java --enable-preview --source 21 HelloJava21.java