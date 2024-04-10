package homework7;

import java.util.Objects;

public class Person {
    private String name;
    private int iq;
    private  int height;
    private  int weight;

    public static int population;
    public static void Size(){
        System.out.println(population);
    }
    public Person(String name, int iq, int height, int weight) {
        this.name = name;
        this.iq = iq;
        this.height = height;
        this.weight = weight;
        population++;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getIq() {
        return iq;
    }

    public void setIq(int iq) {
        this.iq = iq;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return iq == person.iq && height == person.height && weight == person.weight && Objects.equals(name, person.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, iq, height, weight)*31;
    }

    @Override
    public String toString() {
        return "Person{" +  "name='" + name + '\'' + ", iq=" + iq + ", height=" + height + ", weight=" + weight + '}';
    }
}
