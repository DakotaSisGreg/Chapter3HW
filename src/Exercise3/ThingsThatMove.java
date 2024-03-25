package Exercise3;

import Exercise2.Airplane;
import Exercise2.Bird;

import java.util.ArrayList;
import java.util.List;
public class ThingsThatMove {
    public static void main(String[] args) {

        List<Movement> thingsThatMove = new ArrayList<>();

        thingsThatMove.add(new Airplane("Boeing 747", 2016));
        thingsThatMove.add(new Bird("Eagle"));
        thingsThatMove.add(new Bird("Hummingbird"));

        for (Movement thing : thingsThatMove) {
            System.out.println(thing); // Calls toString() method
            thing.fly();
            thing.walk();
            thing.jump();
            System.out.println();
        }
    }
}
