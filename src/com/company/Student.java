package com.company;

public class Student {

    private String dateOfBirth;
    private String name;
    private String srName;
    private int age;

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSrName() {
        return srName;
    }

    public void setSrName(String srName) {
        this.srName = srName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
        if (age>0){
            System.out.println("Age of student pozitiv");
        } else{
            System.out.println("Age of student negative");
        }

    }
}
