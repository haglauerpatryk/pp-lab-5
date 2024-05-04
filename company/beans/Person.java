package company.beans;


import company.exceptions.InvalidAgeException;

public class Person {
    private String name;
    private int age;

    public Person(String name, int age) throws InvalidAgeException {
        setName(name);
        setAge(age);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) throws InvalidAgeException {
        if (age < 0 || age > 125) {
            throw new InvalidAgeException("Invalid age. Age must be between 0 and 125.");
        }
        this.age = age;
    }
}