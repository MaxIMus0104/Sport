package com.example.myapplication.data.model;

public class Team {
    public String name;
    public String Year;
    public String country;
    public int result;
    public String arena;
    private String League;
    private String NewLeague;
    private String transfer;

    public Team (String League, String NewLeague, String transfer) {
        this.League=League;
        this.NewLeague=NewLeague;
        this.transfer=transfer;

    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name=name;
    }
    public String getYear() {
        return Year;
    }
    public void setYear(String Year) {
        this.Year=Year;
    }
    public String getCountry() {
        return country;
    }
    public void setCountry(String country) {
        this.country=country;
    }
    public int getResult() {
        return result;
    }
    public void setResult(int result) {
        this.result=result;
    }
    public String getArena() {
        return arena;
    }
    public void setArena(String arena) {
        this.arena=arena;
    }
    public String getLeague() {
        return League;
    }
    public void setLeague(String League) {
        this.League=League;
    }
    public String getNewLeague () {
        return NewLeague;
    }
    public void setNewLeague(String NewLeague) {
        this.NewLeague=NewLeague;
    }
    public String getTransfer() {
        return transfer;
    }
    public void setTransfer(String transfer) {
        this.transfer=transfer;
    }
}
