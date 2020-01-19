package com.sda.tdd;

public class User {
    private String name, surname;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }


    public boolean signUp(String name, String surname, int age) throws UserIsLessThan18 {
        if (name == null || name.equals("")) {
            return false;
        } else if (surname == null || surname.equals("")) {
            return false;
        } else if (age < 0) {
            return false;
        }
        if (age < 18) {
            throw new UserIsLessThan18("User is under 18");
        }
        return true;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                '}';
    }
}
