import java.util.Objects;

public class Data {

    private int age;
    private String name;

    public Data(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Data data = (Data) o;
        return age == data.age && Objects.equals(name, data.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(age, name);
    }


    @Override
    public String toString() {
        return "Data{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}
