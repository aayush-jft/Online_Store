package com.jft.onlinestore;

public class UserModel {

    private String name, username, phone;

    public UserModel(String name, String username, String phone) {
        this.name = name;
        this.username = username;
        this.phone = phone;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "UserModel{" + "name='" + name + '\'' + ", username='" + username + '\'' + ", phone='" + phone + '\'' + '}';
    }
}
