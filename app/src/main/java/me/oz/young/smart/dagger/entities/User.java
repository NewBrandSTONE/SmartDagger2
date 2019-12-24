package me.oz.young.smart.dagger.entities;


public class User {

    private int age;
    private Phone phone;
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Phone getPhone() {
        return phone;
    }

    public void setPhone(Phone phone) {
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "User{" +
                "age=" + age +
                ", phone=" + phone +
                ", name='" + name + '\'' +
                '}';
    }
}
