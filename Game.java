package com.example.myapplication.data.model;

public class Game {
    public String Team1;
    public String Team2;
    public String arena;
    public int time;
    public int season;
    public String League;
    private int id;

    public Game(int id) {
        this.id = id;
    }
    public String setTeam1() {
        return Team1;
    }
    public void getTeam1(String Team1) {
        this.Team1=Team1;
    }
    public String setTeam2() {
        return Team2;
    }
    public void getTeam2(String Team2) {
        this.Team2=Team2;
    }
    public String setArena() {
        return arena;
    }
    public void getArena(String arena) {
        this.arena=arena;
    }
    public int setTime() {
        return time;
    }
    public void getTime(int time) {
        this.time=time;
    }
    public int setSeason() {
        return season;
    }
    public void getSeason(int season) {
        this.season=season;
    }
    public String setLeague() {
        return League;
    }
    public void getLeague(String League) {
        this.League=League;
    }
    public int setId() {
        return id;
    }
    public void getId(int id) {
        this.id=id;
    }
}
