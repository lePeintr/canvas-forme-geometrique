package formesGeometriques;

public abstract class FormeGeometrique {
    private float x,y;
    private final String NOMDELAFORME;

    public FormeGeometrique(float x, float y, String NOMDELAFORME) {
        this.x = x;
        this.y = y;
        this.NOMDELAFORME = NOMDELAFORME;
    }

    public float getX() {
        return x;
    }

    public void setX(float x) {
        if (x < 0) {
            throw new IllegalArgumentException("La valeur doit être positive.");
        }
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        if (y < 0) {
            throw new IllegalArgumentException("La valeur doit être positive.");
        }
        this.y = y;
    }

    public String getNOMDELAFORME() {
        return NOMDELAFORME;
    }

    abstract float calculSurface();
    abstract float calculPerimetre();
    public abstract String afficheAttribut();
    @Override
    public String toString() {
        return "FormeGeometrique{" +
                "x=" + x +
                ", y=" + y +
                ", NOMDELAFORME='" + NOMDELAFORME + '\'' +
                '}';
    }

}
