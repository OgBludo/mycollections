import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Arrays
        int[] intArray = {1, 2, 3, 4, 5};
        int index = Arrays.binarySearch(intArray, 3);
        System.out.println("Index of 3: " + index);

        // Collections
        List<Integer> intList = new ArrayList<>();
        intList.add(1);
        intList.add(2);
        intList.add(3);
        intList.add(4);
        intList.add(5);
        int listIndex = Collections.binarySearch(intList, 3);
        System.out.println("Index of 3 in list: " + listIndex);

        // Comparator
        List<Person> people = new ArrayList<>();
        people.add(new Person("Alice", 30));
        people.add(new Person("Charlie", 35));
        people.add(new Person("Bob", 25));

        people.sort(new NameComparator());
        Person searchPerson = new Person("Bob", 0);
        int personIndex = Collections.binarySearch(people, searchPerson, new NameComparator());
        System.out.println("Index of Bob: " + personIndex);
    }
}

class NameComparator implements Comparator<Person> {
    @Override
    public int compare(Person p1, Person p2) {
        return p1.getName().compareTo(p2.getName());
    }
}

class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }
}
