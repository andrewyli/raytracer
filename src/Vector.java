/**
 * Created by andrewyli on 2/25/17.
 */
public class Vector {
    double x;
    double y;
    double z;

    public Vector() {
        x = 0.0;
        y = 0.0;
        z = 0.0;
    }

    public Vector(double x_in, double y_in, double z_in) {
        x = x_in;
        y = y_in;
        z = z_in;
    }

    public void normalize() {
        double n = norm();
        if (n == 0.0) {
            return;
        }
        x = x / n;
        y = y / n;
    }

    public double norm() {
        return x * x + y * y + z * z;
    }

    public Vector mul(double d) {
        return new Vector(d * x, d * y, d * z);
    }

    public Vector add(Vector v) {
        return new Vector(x + v.x, y + v.y, z + v.z);
    }

    public Vector sub(Vector v) {
        return new Vector(x - v.x, y - v.y, z - v.z);
    }

    public double dot(Vector v) {
        return x * v.x + y * v.y + z * v.z;
    }

    public Vector neg() {
        return new Vector(-x, -y, -z);
    }

    public void print() {
        System.out.print("[" + x + " " + y + " " + z + "]");
    }

    public double length() {
        return Math.sqrt(norm());
    }
}
