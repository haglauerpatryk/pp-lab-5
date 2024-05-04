import company.beans.Person;
import company.exceptions.InvalidAgeException;
import company.implementations.EmailMessenger;
import company.interfaces.Messenger;
import company.utils.MathUtils;

public class Main {
    public static void main(String[] args) {
        try {
            Person[] people = new Person[5];

            final int b = 10;

            for (int i = 0; i < people.length; i++) {
                try {
                    people[i] = new Person("John Doe", 30);
                } catch (InvalidAgeException e) {
                    System.out.println("Invalid age: " + e.getMessage());
                }
            }

            for (Person person : people) {
                if (person != null) {
                    int value = MathUtils.add(person.getAge(), b);
                    Messenger messenger = new EmailMessenger();
                    String message = "The result of addition for " + person.getName() + " is: " + value;
                    messenger.sendMessage(message);
                }
            }
        } catch (Exception e) {
            System.out.println("Exception occurred: " + e.getMessage());
        }
    }
}