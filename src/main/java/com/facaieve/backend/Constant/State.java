package com.facaieve.backend.Constant;

public enum State {

    IN("IN"),
    OUT("OUT");

    private String state;

    State(String state){
        this.state = state;
    }

    public String getState() {
        return state;
    }
}
