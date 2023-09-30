import java.util.Objects;

void main() {
    Object value = System.console().readLine("Enter any values expect NULL : ");
    var result = switch(value) {
        case Object o when Objects.nonNull(o)-> String.format("Object %s", o.toString());
        default -> throw new NullPointerException();
    };

    System.out.println(result);
}