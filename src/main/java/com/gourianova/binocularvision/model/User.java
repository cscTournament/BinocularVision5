package com.gourianova.binocularvision.model;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Objects;


@Entity
public class User implements Serializable {
    @Id
    private long id;
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false, updatable = false)
    private BigDecimal balance;
    private LocalDate create_time;

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    private String first_name;
    private String last_name;
    private String login;
    private String password;
    private int roles_id;


    public User() {
    }
    public User( BigDecimal balance,LocalDate create_time, String firstName, String lastName,  String login, String password,  int roleId, long id) {
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

    public User(long incrementAndGet, LocalDate now, String name) {
        this.id=incrementAndGet;
        this.create_time=now;
        this.roles_id=Integer.parseInt(name);
    }


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

 /*   public String getFirstName() {
        return first_na me;
    }

    public void setFirstName(String first_name) {
        this.first_name = first_name;
    }

    public String getLastName() {
        return last_name;
    }

    public void setLastName(String last_name) {
        this.last_name = last_name;
    }*/

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
                Objects.equals(getFirst_name(), user.getFirst_name()) &&
                Objects.equals(getLast_name(), user.getLast_name()) &&
                Objects.equals(getLogin(), user.getLogin()) &&
                Objects.equals(getPassword(), user.getPassword()) &&
                Objects.equals(getBalance(), user.getBalance()) &&
                getRoleId() == user.getRoleId()&&
                Objects.equals(getCreate_time(), user.getCreate_time()) ;
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getFirst_name(), getLast_name(), getLogin(), getPassword(), getBalance(), getRoleId(), getCreate_time());
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", first_name='" + first_name + '\'' +
                ", last_name='" + last_name + '\'' +
                ", login='" + login + '\'' +
                ", password='" + password + '\'' +
                ", balance=" + balance +
                ", roleId=" + roles_id +
                ", create_time="+ create_time+
                "} " + super.toString();
    }}
