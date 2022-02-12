package com.gourianova.binocularviusion.model;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;


@Entity
public class User implements Serializable {
    @Id
    private int id;
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false, updatable = false)
    private BigDecimal balance;
    private LocalDate create_time;
    private String first_name;
    private String last_name;
    private String login;
    private String password;
    private int roles_id;


    public User() {
    }
    public User(BigDecimal balance,LocalDate create_time, String firstName, String lastName,  String login, String password,  int roleId, int id) {
        {
            this.id = id;
            this.first_name = firstName;
            this.last_name = lastName;
            this.login = login;
            this.password = password;
            this.balance = balance;
            this.roles_id = roleId;
            this.create_time=create_time;}
    }
    public User(BigDecimal balance,LocalDate create_time, String firstName, String lastName,  String login, String password,  int roleId) {
        {

            this.first_name = firstName;
            this.last_name = lastName;
            this.login = login;
            this.password = password;
            this.balance = balance;
            this.roles_id = roleId;
            this.create_time=create_time;}
    }

    public User(String login, String password, String firstName, String lastName,  BigDecimal balance, int roleId, LocalDate create_time) {
        this.first_name = firstName;
        this.last_name = lastName;
        this.login = login;
        this.password = password;
        this.balance = balance;
        this.roles_id = roleId;
        this.create_time=create_time;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return first_name;
    }

    public void setFirstName(String firstName) {
        this.first_name = firstName;
    }

    public String getLastName() {
        return last_name;
    }

    public void setLastName(String lastName) {
        this.last_name = lastName;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public BigDecimal getBalance() {
        return balance;
    }

    public void setBalance(BigDecimal balance) {
        this.balance = balance;
    }

    public int getRoleId() {
        return roles_id;
    }

    public void setRoleId(int roleId) {
        this.roles_id = roleId;
    }

    public LocalDate getCreate_time() {
        return create_time;
    }

    public void setCreate_time(LocalDate create_time) {
        this.create_time = create_time;
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof User)) return false;
        User user = (User) o;
        return getId() == user.getId() &&
                Objects.equals(getFirstName(), user.getFirstName()) &&
                Objects.equals(getLastName(), user.getLastName()) &&
                Objects.equals(getLogin(), user.getLogin()) &&
                Objects.equals(getPassword(), user.getPassword()) &&
                Objects.equals(getBalance(), user.getBalance()) &&
                getRoleId() == user.getRoleId()&&
                Objects.equals(getCreate_time(), user.getCreate_time()) ;
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getFirstName(), getLastName(), getLogin(), getPassword(), getBalance(), getRoleId(), getCreate_time());
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", firstName='" + first_name + '\'' +
                ", lastName='" + last_name + '\'' +
                ", login='" + login + '\'' +
                ", password='" + password + '\'' +
                ", balance=" + balance +
                ", roleId=" + roles_id +
                ", create_time="+ create_time+
                "} " + super.toString();
    }}
