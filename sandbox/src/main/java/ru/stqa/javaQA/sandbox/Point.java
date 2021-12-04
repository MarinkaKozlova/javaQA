package ru.stqa.javaQA.sandbox;

public class Point {

    public static void main(String[] args) {


        PointTT P = new PointTT(43, -10, -20, 21);
        System.out.println("Расстояние между двумя точками =" + distance(P));
    }

    public static double distance(PointTT P) {
        return Math.sqrt((P.p3 - P.p1) * (P.p3 - P.p1) + (P.p4 - P.p2) * (P.p4 - P.p2));
    }
}

