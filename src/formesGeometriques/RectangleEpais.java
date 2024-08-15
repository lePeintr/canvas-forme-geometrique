package formesGeometriques;

public class RectangleEpais extends Rectangle{
    private float epaisseurDeContour;

    public RectangleEpais(float x, float y, String NOMDELAFORME, float longueur, float largeur,float epaisseurDeContour) {
        super(x, y, NOMDELAFORME, longueur, largeur);
        this.epaisseurDeContour = epaisseurDeContour;
    }

    public float getEpaisseurDeContour() {
        return epaisseurDeContour;
    }

    public void setEpaisseurDeContour(float epaisseurDeContour) {
        this.epaisseurDeContour = epaisseurDeContour;
    }

    @Override
    public String afficheAttribut() {
        return "Nom de la forme: "+ super.getNOMDELAFORME()+
                ",Abscisse: "+ super.getX()+
                ", Ordonne: "+ super.getY() +
                ",Longueur : "+longueur +
                ",largeur: "+largeur +
                ",epaisseur de contour: "+epaisseurDeContour;
    }

    @Override
    public String toString() {
        return super.toString() +  "RectangleEpais{" +
                "longueur=" + longueur +
                ", largeur=" + largeur +
                ", epaisseurDeContour=" + epaisseurDeContour +
                '}';
    }

}
