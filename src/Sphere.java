/**
 * Created by andrewyli on 2/25/17.
 */

public class Sphere extends SceneObject {
    Vector pos;
    double radius;
    Vector surface_color;
    Vector emission_color;
    double transparency;
    double reflection;

    public Sphere(Vector p, double r, Vector sc, Vector ec, double tp, double ref) {
        pos = p;
        radius = r;
        surface_color = sc;
        emission_color = ec;
        transparency = tp;
        reflection = ref;
    }

    /**
     * Return a Vector representing the two locations of intersection and an
     * indicator for whether it does intersect.
     *
     * @param r
     * @return
     */
    public Vector rayIntersects(Ray r) {
        Vector directed = r.pos.sub(pos);
        double dot_len = r.dir.dot(directed);
        if (dot_len < 0) {
            return new Vector(0.0, 0.0, -1.0);
        }
        double dist = directed.norm() - dot_len * dot_len;
        if (dist > radius) {
            return new Vector(0.0, 0.0, -1.0);
        }
        double margin = Math.sqrt(radius * radius - dist * dist);
        return new Vector(dot_len - margin, dot_len + margin, 1.0);
    }
}
