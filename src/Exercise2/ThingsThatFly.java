package Exercise2;

import Exercise2.Airplane;
import Exercise2.Bird;
import Exercise2.Flight;

import java.util.ArrayList;
import java.util.List;
public class ThingsThatFly {
    public static void main(String[] args) {

        List<Flight> flyingThings = new ArrayList<>();

        flyingThings.add(new Airplane("Boeing 747", 2016));
        flyingThings.add(new Bird("Eagle"));
        flyingThings.add(new Bird("Hummingbird"));

        for (Flight flyingThing : flyingThings) {
            System.out.print(flyingThing);
            System.out.print(": ");
            flyingThing.fly();
        }
    }
}
