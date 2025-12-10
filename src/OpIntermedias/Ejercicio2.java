package OpIntermedias;

import java.util.ArrayList;
import java.util.List;

public class Ejercicio2 {
    public static void main(String[] args) {
        Person p1 = new Person("Juan", 1969);
        Person p2 = new Person("Amanda", 2006);
        Person p3 = new Person("Maria", 1992);
        Person p4 = new Person("Arantxa", 1969);
        List<Person> persons = new ArrayList<Person>();
        persons.add(p1);
        persons.add(p2);
        persons.add(p3);
        persons.add(p4);
        persons.stream().filter(p -> p.getName().startsWith("A")).forEach(System.out::println);
    }
}
