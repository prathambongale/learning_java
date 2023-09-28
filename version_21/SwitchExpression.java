void main() {
    // Switch expression
    var consle = System.console();
    var month = consle.readLine("Enter Month in words to get number : ");
    var year = 2023;

    var monthDay = switch (month.toUpperCase()) {
        case "JANUARY", "MARCH", "MAY", "JULY", "AUGUST", "OCTOBER", "DECEMBER" -> 31;
        case "APRIL", "JUNE", "SEPTEMBER", "NOVEMBER" -> 30;
        case "FEBRUARY" -> {
            if (((year % 4 == 0) && !(year % 100 == 0))|| (year % 400 == 0))
                yield 29;
            else
                yield 28;
        }
        default -> "Incorrect Month Entered";
    };
    System.out.println("Month number is : " + monthDay);
}

