package lesson_33._04_stream_usage.model;

import java.util.stream.Stream;

public class Dog implements Comparable<Dog>{
    private String name;
    private int age;

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Dog{");
        sb.append("age=").append(age);
        sb.append(", name=").append(name);
        sb.append('}');
        return sb.toString();
    }

    public String getName() {
        return name;
    }

    public Dog setName(String name) {
        this.name = name;
        return this;
    }

    public int getAge() {
        return age;
    }

    public Dog setAge(int age) {
        this.age = age;
        return this;
    }

    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public int compareTo(Dog dog) {
        return name.compareTo(dog.getName());
    }
}
