import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionList {
    public static void main(String[] args) {

        Person person = new Person();
        person.setHobbies("coding");
        person.setHobbies("sport");

        doSomething(person.getHobbies());
        for (var hobby : person.getHobbies()) {
            System.out.println(hobby);
        }

        // imutable list
        List<Integer> numbers = List.of(1,2,3,4,5,6);
        List<String> imutableList = Collections.emptyList();
        imutableList.add("satu");
        imutableList.add("dua");

    }

    public static void doSomething(List<String> hobbies) {
        hobbies.add("Eaa");
    }
}

class Person {
    private List<String> hobbies;

    public Person() {
        this.hobbies = new ArrayList<>();
    }

    public List<String> getHobbies() {
        return Collections.unmodifiableList(hobbies);
    }

    public void setHobbies(String hobby) {
        hobbies.add(hobby);
    }
}
