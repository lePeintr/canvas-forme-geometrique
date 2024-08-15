package formesGeometriques;

public class CercleColorie extends Cercle{
    private String couleurDeRemplissage;
    public CercleColorie(float x, float y, String NOMDELAFORME, float rayon,String couleurDeRemplissage) {
        super(x, y, NOMDELAFORME, rayon);
        this.couleurDeRemplissage = couleurDeRemplissage;
    }

    public String getCouleurDeRemplissage() {
        return couleurDeRemplissage;
    }

    public void setCouleurDeRemplissage(String couleurDeRemplissage) {
        this.couleurDeRemplissage = couleurDeRemplissage;
    }

    @Override
    public String afficheAttribut() {
        return "Nom de la forme: "+ super.getNOMDELAFORME()+
                ",Abscisse: "+ super.getX()+
                ", Ordonne: "+ super.getY() +
                ",rayon : "+rayon +
                ",couleur de remplissage: "+couleurDeRemplissage ;
    }

    @Override
    public String toString() {
        return super.toString() + "CercleColorie{" +
                "rayon=" + rayon +
                ", PI=" + PI +
                ", couleurDeRemplissage='" + couleurDeRemplissage + '\'' +
                '}';
    }

}
