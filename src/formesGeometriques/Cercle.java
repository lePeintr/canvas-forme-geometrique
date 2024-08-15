package formesGeometriques;

public abstract class Cercle extends FormeGeometrique{
    protected float rayon;
    protected final float PI = 3.14f;
    public Cercle(float x, float y, String NOMDELAFORME,float rayon) {
        super(x, y, NOMDELAFORME);
        this.rayon=rayon;
    }

    public float getRayon() {
        return rayon;
    }

    public void setRayon(float rayon) {
        this.rayon = rayon;
    }

    public float getPI() {
        return PI;
    }

    @Override
    public float calculSurface() {
        return rayon*rayon*PI;
    }

    @Override
    public float calculPerimetre() {
        return rayon*2*PI;
    }

    @Override
    public String toString() {
        return super.toString() +  "Cercle{" +
                "rayon=" + rayon +
                ", PI=" + PI +
                '}';
    }
}
