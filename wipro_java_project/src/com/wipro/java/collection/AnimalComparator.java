package com.wipro.java.collection;

public class AnimalComparator {
    private String name;
    private int age;
    private double weight;

    // Constructor
    public AnimalComparator(String name, int age, double weight) {
        this.name = name;
        this.age = age;
        this.weight = weight;
    }

    // Getter methods
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getWeight() {
        return weight;
    }

    @Override
    public String toString() {
        return name + " - Age: " + age + ", Weight: " + weight;
    }
}
