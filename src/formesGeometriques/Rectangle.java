package formesGeometriques;

public abstract class Rectangle extends FormeGeometrique{
    protected float longueur,largeur;
    public Rectangle(float x, float y, String NOMDELAFORME,float longueur,float largeur) {
        super(x, y, NOMDELAFORME);
        this.largeur=largeur;
        this.longueur=longueur;
    }

    public float getLongueur() {
        return longueur;
    }

    public void setLongueur(float longueur) {
        this.longueur = longueur;
    }

    public float getLargeur() {
        return largeur;
    }

    public void setLargeur(float largeur) {
        this.largeur = largeur;
    }


    @Override
    public float calculSurface() {
        return longueur*largeur;
    }

    @Override
    public float calculPerimetre() {
        return (longueur+largeur)*2;
    }

    @Override
    public String toString() {
        return super.toString() +  "Rectangle{" +
                "longueur=" + longueur +
                ", largeur=" + largeur +
                '}';
    }
}
