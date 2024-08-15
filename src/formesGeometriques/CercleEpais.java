package formesGeometriques;

public class CercleEpais extends Cercle{
    private float epaisseurDeContour;

    public CercleEpais(float x, float y, String NOMDELAFORME, float rayon, float epaisseurDeContour) {
        super(x, y, NOMDELAFORME, rayon);
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
                ",rayon : "+rayon +
                ",epaisseur de contour: "+epaisseurDeContour;
    }

    @Override
    public String toString() {
        return super.toString() +  "CercleEpais{" +
                "rayon=" + rayon +
                ", PI=" + PI +
                ", epaisseurDeContour=" + epaisseurDeContour +
                '}';
    }

}
