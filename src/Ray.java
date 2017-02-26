/**
 * Created by andrewyli on 2/25/17.
 */
public class Ray {
    Vector pos;
    Vector dir;

    public Ray(float xp, float yp, float zp, float xd, float yd, float zd) {
        pos = new Vector(xp, yp, zp);
        dir = new Vector(xd, yd, zd);
    }
}
