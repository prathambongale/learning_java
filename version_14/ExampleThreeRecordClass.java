import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ExampleThreeRecordClass {
    public static void main(String[] args) {
        State state1 = new State("Gauteng");
        City city1 = new City("Johannesburg", state1);
        City city2 = new City("Sandton", state1);
        City city3 = new City("Randburg", state1);
        City city4 = new City("Pretoria", state1);
        State state2 = new State("Western Cape");
        City city5 = new City("Cape Town", state2);
        City city6 = new City("Gordens Bay", state2);
        City city7 = new City("Stellenbosch", state2);
        State state3 = new State("Limpopo");
        City city8 = new City("Polokwane", state3);
        City city9 = new City("Krugar National Park", state3);
        State state4 = new State("Eastern Cape");
        City city10 = new City("Laydy Grey", state4);

        List<City> cities = List.of(city1, city2, city3, city4, city5, city6, city7, city8, city9, city10);

        Map<State, Long> numberOfCitiesPerState = cities
                .stream()
                .collect(Collectors.groupingBy(City::state, Collectors.counting()));

        System.out.println("Number of Cities Per State : " + numberOfCitiesPerState);

        Map.Entry<State, Long> stateWithTheMostCities = numberOfCitiesPerState
                .entrySet()
                .stream()
                .max(Map.Entry.comparingByValue())
                .orElseThrow();
        
        System.out.println("State with the most Cities : " + stateWithTheMostCities);
    }
}
