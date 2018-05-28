package com.example.demo;

import java.io.Serializable;

public class Gazedata implements Serializable{
    private double xPos;
    private double yPos;

    public Gazedata() {}
    public Gazedata(double xPos,double yPos){
        this.xPos = xPos;
        this.yPos = yPos;
    }

    public double getxPos() {
        return xPos;
    }

    public double getyPos() {
        return yPos;
    }

    public void setxPos(double xPos) {
        this.xPos = xPos;
    }

    public void setyPos(double yPos) {
        this.yPos = yPos;
    }
}
