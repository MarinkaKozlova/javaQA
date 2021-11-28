package ru.stqa.javaQA.sandbox;

public class Point {

    public static void main(String[] args) {

        MainP p1 = new MainP(19, 23);
        MainP p2 = new MainP(57, 99);
        System.out.println("Расстояние между двумя точками = " + p1.x + ", " + p1.y + " и " + p2.x + ", " + p2.y + " = " + p1.distance(p2));

    }

}
