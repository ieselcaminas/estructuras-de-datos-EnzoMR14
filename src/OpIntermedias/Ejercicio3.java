package OpIntermedias;

import java.util.ArrayList;
import java.util.List;

public class Ejercicio3 {
    public static void main(String[] args) {
        Person p1 = new Person("Romeo", 1969);
        Person p2 = new Person("Barri", 2006);
        Person p3 = new Person("Escobar", 1992);
        Person p4 = new Person("Walter", 1969);
        Person p5 = new Person("Jackson", 1964);
        List<Person> persons = new ArrayList<Person>();
        persons.add(p1);
        persons.add(p2);
        persons.add(p3);
        persons.add(p4);
        persons.add(p5);
        persons.stream()
                .map(Person::getName)
                .distinct().sorted().forEach(System.out::println);

    }
}
