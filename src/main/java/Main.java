import java.util.Random;

public class Main {

    public static void main(String[] args) {
        Random random = new Random();
        int objectsInstances = random.nextInt(15);
        Person[] people = new Person[objectsInstances];

        for (int i = 0; i < objectsInstances; i++) {
            people[i] = new Person("Lorem", "Ipsum");
        }

        System.out.println(Person.getInstancesCouner());
    }
}
