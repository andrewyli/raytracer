/**
 * Created by andrewyli on 2/25/17.
 */
public class Cylinder extends SceneObject {
    Vector pos;

    public Cylinder(Vector v) {
        pos = v;
    }

    public Vector rayIntersects(Ray r) {
        return new Vector();
    }
}
