package lesson_33._04_stream_usage.model;

public class Chicken {
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Chicken chicken = (Chicken) o;

        if (weight != chicken.weight) return false;
        return name != null ? name.equals(chicken.name) : chicken.name == null;
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + weight;
        return result;
    }

    private String name;
    private int weight;

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Chicken{");
        sb.append("name='").append(name).append('\'');
        sb.append(", weight=").append(weight);
        sb.append('}');
        return sb.toString();
    }

    public String getName() {
        return name;
    }

    public Chicken setName(String name) {
        this.name = name;
        return this;
    }

    public int getWeight() {
        return weight;
    }

    public Chicken setWeight(int weight) {
        this.weight = weight;
        return this;
    }

    public Chicken(String name, int weight) {
        this.name = name;
        this.weight = weight;
    }
}
