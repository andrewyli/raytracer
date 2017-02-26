/**
 * Created by andrewyli on 2/25/17.
 */
public abstract class SceneObject {
    int xpos;
    int ypos;
    int zpos;

    abstract Vector ray_intersects(Ray r);
}
