package com.example.myapplication.data.model;

public class League {
    public String name;
    public String date;
    public int season;
    private int Stat;

    public League(int Stat){
        this.Stat=Stat;
    }
    public String setName() {
        return name;
    }
    public void getName(String name) {
        this.name=name;
    }
    public String setDate() {
        return date;
    }
    public void getDate() {
        this.date=date;
    }
    public int setSeason() {
        return season;
    }
    public void getSeason(int season) {
        this.season=season;
    }
    public int setStat() {
        return Stat;
    }
    public void getStat(int Stat) {
        this.Stat=Stat;
    }
}
