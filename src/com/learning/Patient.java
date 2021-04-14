package com.learning;

public class Patient {
    private String name;
    private int age;
    private Eye leftEye;
    private Eye righEye;
    private Heart heart;

    public Patient(String name, int age, Eye leftEye, Eye righEye, Heart heart) {
        this.name = name;
        this.age = age;
        this.leftEye = leftEye;
        this.righEye = righEye;
        this.heart = heart;
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

    public Eye getLeftEye() {
        return leftEye;
    }

    public void setLeftEye(Eye leftEye) {
        this.leftEye = leftEye;
    }

    public Eye getRighEye() {
        return righEye;
    }

    public void setRighEye(Eye righEye) {
        this.righEye = righEye;
    }

    public Heart getHeart() {
        return heart;
    }

    public void setHeart(Heart heart) {
        this.heart = heart;
    }
}

