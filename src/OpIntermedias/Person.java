package OpIntermedias;

import java.util.ArrayList;
import java.util.List;

public class Person {
    private String name;
    private int birthYear;

    public Person(String name, int birthYear) {
        this.name = name;
        this.birthYear = birthYear;
    }

    public String getName() {
        return this.name;
    }

    public int getBirthYear() {
        return this.birthYear;
    }

    public String toString() {
        return this.name + " (" + this.birthYear + ")";
    }

}
class streams{
    public static void main(String[] args){
        Person p1 = new Person("Juan", 1969);
        Person p2 = new Person("Maria", 1992);
        List<Person> persons = new ArrayList<>();
        persons.add(p1);
        persons.add(p2);
        persons.stream().filter(p -> p.getBirthYear() <= 1970).forEach(System.out::println);
    }
}