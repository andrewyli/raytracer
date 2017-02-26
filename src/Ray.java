/**
 * Created by andrewyli on 2/25/17.
 */
import java.util.ArrayList;

public class Ray {
    Vector pos;
    Vector dir;

    public Ray(float xp, float yp, float zp, float xd, float yd, float zd) {
        pos = new Vector(xp, yp, zp);
        dir = new Vector(xd, yd, zd);
    }

    public Vector trace(ArrayList<SceneObject> objects, int depth, Vector light_pos) {
        SceneObject obj_hit;
        double max_dist = Double.POSITIVE_INFINITY;
        for (SceneObject so : objects) {
            Vector intersection = so.rayIntersects(this);
            if (intersection.z < 0.0) {
                continue;
            }
            if (intersection.x < 0.0) {
                intersection.x = intersection.y;
            }
            if (max_dist > intersection.x) {
                max_dist = intersection.x;
                obj_hit = so;
            }
        }
        boolean is_shadowed = false;
        if (obj_hit != null) {
            Vector hit_pos =
            Ray reflected;
            reflected.dir = ;
        } else {
            return new Vector();
        }

        return new Vector();
    }
}
