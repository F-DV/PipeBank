package com.bank.bank.domain.model;

import java.util.Date;
import java.util.Objects;

public class User {

    private String id;
    private String name;
    private String lastName;
    private Date birthday;
    private String phoneNumber;
    private String numberAccount;

    public User() {
    }

    public User(String id, String name, String lastName, Date birthday, String phoneNumber, String numberAccount) {
        this.id = id;
        this.name = name;
        this.lastName = lastName;
        this.birthday = birthday;
        this.phoneNumber = phoneNumber;
        this.numberAccount = numberAccount;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getNumberAccount() {
        return numberAccount;
    }

    public void setNumberAccount(String numberAccount) {
        this.numberAccount = numberAccount;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return Objects.equals(id, user.id) && Objects.equals(name, user.name) && Objects.equals(lastName, user.lastName) && Objects.equals(birthday, user.birthday) && Objects.equals(phoneNumber, user.phoneNumber) && Objects.equals(numberAccount, user.numberAccount);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, lastName, birthday, phoneNumber, numberAccount);
    }

    @Override
    public String toString() {
        return "User{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", birthday=" + birthday +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", numberAccount='" + numberAccount + '\'' +
                '}';
    }
}
