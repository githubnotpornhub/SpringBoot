package com.my.beginspringboot.entity;

public class User {

    private Integer id;
    private String username;
    private String password;
    private Integer age;
    private String email;
    private String job;
    private Integer sal;
    private Integer bonus;
    private Integer year;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public Integer getSal() {
        return sal;
    }

    public void setSal(Integer sal) {
        this.sal = sal;
    }

    public Integer getBonus() {
        return bonus;
    }

    public void setBonus(Integer bonus) {
        this.bonus = bonus;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public User(Integer id, String username, String password, Integer age, String email, String job, Integer sal, Integer bonus, Integer year) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.age = age;
        this.email = email;
        this.job = job;
        this.sal = sal;
        this.bonus = bonus;
        this.year = year;
    }

    public User() {
    }
}
