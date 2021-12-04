package ru.stqa.javaQA.sandbox;

import org.testng.Assert;
import org.testng.annotations.Test;

import static ru.stqa.javaQA.sandbox.Point.distance;

public class PointTest {
    @Test
    public void testArea () {
        PointTT P = new PointTT(43, -10, -20, 21);
        Assert.assertEquals(distance(P), 70.21395872616783);

    }
    @Test
    public void testArea1 () {
        PointTT P = new PointTT(43, -11, -29, 21);
        Assert.assertEquals(distance(P), 70.21395872616783);

    }
    @Test
    public void testArea2 () {
        PointTT P = new PointTT(83, -11, -20, 21);
        Assert.assertEquals(distance(P), 70.21395872616783);

    }
    }

