package com.example.myapplication.data.model;

public class Player {
    public String name;
    public String surname;
    public int year;
    public String match;
    private String transfer;
    private int career;

    public Player(String transfer, int career) {
        this.transfer=transfer;
        this.career=career;
    }
    public String setName() {
        return name;
    }
    public void getName(String name) {
        this.name=name;
    }
    public String setSurname() {
        return surname;
    }
    public void getSurname(String surname) {
        this.surname=surname;
    }
    public int setYear() {
        return year;
    }
    public void getYear(int year) {
        this.year=year;
    }
    public String setMatch() {
        return match;
    }
    public void getMatch(String match) {
        this.match=match;
    }
    public String setTransfer() {
        return transfer;
    }
    public void getTransfer(String transfer) {
        this.transfer=transfer;
    }
    public int setCareer() {
        return career;
    }
    public void getCareer(int career) {
        this.career=career;
    }
}

