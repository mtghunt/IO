package ru.io.basic.model;

public class Person {

    private String fio;
    private int age;
    private int children;
    private int workAge;


    public Person(String fio, int age, int children, int workAge) {
        this.fio = fio;
        this.age = age;
        this.children = children;
        this.workAge = workAge;
    }

    public Person() {

    }

    public String getFio() {
        return fio;
    }

    public void setFio(String fio) {
        this.fio = fio;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getChildren() {
        return children;
    }

    public void setChildren(int children) {
        this.children = children;
    }

    public int getWorkAge() {
        return workAge;
    }

    public void setWorkAge(int workAge) {
        this.workAge = workAge;
    }

    @Override
    public String toString() {
        return "Person{" +
                "fio='" + fio + '\'' +
                ", age=" + age +
                ", children=" + children +
                ", workAge=" + workAge +
                '}';
    }
}
