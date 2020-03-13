package com.yoelc.firstmod.math;

public class Vector2D {

    public float x;
    public float y;

    public Vector2D() {
        x = y = 0.0f;
    }

    public Vector2D(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public String toString() {
        return "Vector2D(" + x + ", " + y + ")";
    }

    public float length() {
        return (float) Math.sqrt(x * x + y * y);
    }

    public Vector2D add(Vector2D v1) {
        return new Vector2D(this.x + v1.x, this.y + v1.y);
    }

    public Vector2D sub(Vector2D v1) {
        return new Vector2D(this.x - v1.x, this.y - v1.y);
    }

    public Vector2D scale(float scaleFactor) {
        return new Vector2D(this.x * scaleFactor, this.y * scaleFactor);
    }

    public Vector2D normalize() {
        float length = this.length();
        return (length != 0) ? new Vector2D(this.x / length, this.y / length) : new Vector2D();

    }

    public float dotProduct(Vector2D v1) {
        return this.x * v1.x + this.y * v1.y;
    }

    public Vector2D rotate(float radians) {
        return new Vector2D((float) ((this.x * Math.cos(radians)) - (this.y * Math.sin(radians))), (float) ((this.x * Math.sin(radians)) + (this.y * Math.cos(radians))));
    }
}