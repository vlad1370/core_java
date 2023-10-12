package lesson_33._01_intro_lambdas.model;

public class Cat {
    private String name;
    private int age;
    private Breed breed;

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Cat{");
        sb.append("age=").append(age);
        sb.append(", breed=").append(breed);
        sb.append(", name='").append(name).append('\'');
        sb.append('}');
        return sb.toString();
    }

    public String getName() {
        return name;
    }

    public Cat setName(String name) {
        this.name = name;
        return this;
    }

    public int getAge() {
        return age;
    }

    public Cat setAge(int age) {
        this.age = age;
        return this;
    }

    public Breed getBreed() {
        return breed;
    }

    public Cat setBreed(Breed breed) {
        this.breed = breed;
        return this;
    }

    public Cat(String name, int age, Breed breed) {
        this.name = name;
        this.age = age;
        this.breed = breed;
    }
}
