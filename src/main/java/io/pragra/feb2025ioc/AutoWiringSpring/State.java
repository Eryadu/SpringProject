package io.pragra.feb2025ioc.AutoWiringSpring;

import org.springframework.beans.factory.annotation.Autowired;

public class State {
    private String name;
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
}

class City {
    private int id;
    private String name;
    private State s;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String st) {
        this.name = st;
    }
        /*public State getS(){
            return s;
        }*/

    //@Autowired
    public void setS(State sta) {
        this.s = sta;
    }

    public void showCityDetails() {
        System.out.println("City Id :" + id);
        System.out.println("City Name :" + name);
        System.out.println("State :" + s.getName());
    }
}