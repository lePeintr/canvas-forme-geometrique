package formesGeometriques;

public class RectangleColorie extends Rectangle{
    private String couleurDeRemplissage;

    public RectangleColorie(float x, float y, String NOMDELAFORME, float longueur, float largeur, String couleurDeRemplissage) {
        super(x, y, NOMDELAFORME, longueur, largeur);
        this.couleurDeRemplissage=couleurDeRemplissage;
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
                ",Longueur : "+longueur +
                ",largeur: "+largeur +
                ",couleur de remplissage: "+couleurDeRemplissage ;
    }

    @Override
    public String toString() {
        return super.toString() +  "RectangleColorie{" +
                "longueur=" + longueur +
                ", largeur=" + largeur +
                ", couleurDeRemplissage='" + couleurDeRemplissage + '\'' +
                '}';
    }

}
