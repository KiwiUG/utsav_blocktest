package model;

import java.util.ArrayList;

public class Users {
    int id;
    String name;
    int age;
    String email;
    ArrayList<Orders> orders;

    public Users(int id, String name, int age, String email, ArrayList<Orders> orders) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.email = email;
        this.orders = orders;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public void setAge(int age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public ArrayList<Orders> getOrders() {
        return orders;
    }

    public void setOrders(ArrayList<Orders> orders) {
        this.orders = orders;
    }
}
