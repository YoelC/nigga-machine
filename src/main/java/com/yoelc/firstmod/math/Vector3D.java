package com.yoelc.firstmod.math;

public class Vector3D {
    public float x, y, z;

    public Vector3D(float x, float y, float z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public Vector3D() {
        this.x = 0;
        this.y = 0;
        this.z = 0;
    }

    public float length() {
        return (float) Math.sqrt(this.x*this.x + this.y*this.y + this.z*this.z);
    }

    public Vector3D normalize() {
        float l = (float) (1 / Math.sqrt(this.x*this.x + this.y*this.y + this.z*this.z));
        return new Vector3D(x * l, y * l, z * l);
    }

    public Vector3D add(Vector3D v) {
        return new Vector3D(this.x + v.x, this.y + v.y, this.z + v.z);
    }

    public Vector3D subtract(Vector3D v) {
        return new Vector3D(this.x - v.x, this.y - v.y, this.z - v.z);

    }

    public Vector3D scale(float s) {
        return new Vector3D(this.x * s, this.y * s, this.z * s);
    }

    public float dot(Vector3D v) {
        return this.x*v.x + this.y*v.y + this.z*v.z;
    }

    public Vector3D cross(Vector3D v) {
        return new Vector3D(this.y*v.z - this.z*v.y, this.z*v.x - this.x*v.z, this.x*v.y - this.y*v.x);
    }

    public Vector3D rotateY(double theta) {
        float sint = (float)Math.sin(theta);
        float cost = (float)Math.cos(theta);
        return new Vector3D(z * sint + x * cost, y, z * cost - x * sint);

    }

    public Vector3D lerp(Vector3D b, float t)
    {
        if (t < 0) {
            t = 0.0f;
        } else if (t > 1) {
            t = 1.0f;
        }

        return new Vector3D(
                this.x + (b.x - this.x) * t,
                this.y + (b.y - this.y) * t,
                this.z + (b.z - this.z) * t
        );
    }

}