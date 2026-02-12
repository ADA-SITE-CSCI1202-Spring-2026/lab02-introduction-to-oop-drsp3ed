package week04.geometry;

import java.lang.Math;

public class Point {
    private float x;
    private float y;

    public Point() {
        this.x = 0f;
        this.y = 0f;
        System.out.println("Object created");
    };

    public Point(float x, float y) {
        this.x = x;
        this.y = y;
    };

    public Point(Point p) {
        this.x = p.x;
        this.y = p.y;
    }

    public float getX() {
        return this.x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return this.y;
    }

    public void setY(float y) {
        this.y = y;
    }

    public void translate(float dX, float dY) {
        this.x += dX;
        this.y += dY;
    }

    public float distance(Point p) {
        return (float) Math.sqrt(Math.pow((this.x + p.x), 2) + Math.pow((this.y + p.y), 2));
    }

    public boolean equals (Point p) {
        if (this.x == p.x && this.y == p.y) return true;
        return false;
    }
}
