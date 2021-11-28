package ru.stqa.javaQA.sandbox;

public class MainP {

    public double x;
    public double y;

    public MainP(double x1, double y1) {
        this.x = x1;
        this.y = y1;
    }

    public double distance(MainP p2) {

        double dx = p2.x - this.x;
        double dy = p2.y - this.y;
        double r = Math.pow(dx, 2) + Math.pow(dy, 2);
        return Math.sqrt(r);

    }

}