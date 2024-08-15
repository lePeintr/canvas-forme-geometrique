package formesGeometriques;

import exceptions.ErreurDeplacementException;
import exceptions.FormeDejaExistanteException;

import java.util.List;

/**
 * Cette classe Canvas représente la gestion des canvas contenant des formes géométriques
 *
 * @author Utilisateur
 * @version 1.0
 */
public class Canvas {
    private String titre;
    private float longueur,largeur;
    private List<FormeGeometrique> formeGeometriques;

    public Canvas(String titre, float longueur, float largeur, List<FormeGeometrique> formeGeometriques) {
        this.titre = titre;
        this.longueur = longueur;
        this.largeur = largeur;
        this.formeGeometriques = formeGeometriques;
    }

    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
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

    public List<FormeGeometrique> getFormeGeometriques() {
        return formeGeometriques;
    }

    public void setFormeGeometriques(List<FormeGeometrique> formeGeometriques) {
        this.formeGeometriques = formeGeometriques;
    }

    /**
     * Methode de filtrage en fonction d'un nom passé en paramètre à l'aide des streams
     * @param nomDeLaFormeGeometrique
     * @return
     */
    public FormeGeometrique rechercheFormeGeometriqueWithStream(String nomDeLaFormeGeometrique){
        return  formeGeometriques.stream()
                .filter(forme->forme.getNOMDELAFORME().equalsIgnoreCase(nomDeLaFormeGeometrique))
                .findFirst()
                .orElse(null);
    }

    /**
     *  Methode de filtrage en fonction d'un nom passé en paramètre
     * @param nomDeLaFormeGeometrique
     * @return
     */
    public FormeGeometrique rechercheFormeGeometriqueWithCompare(String nomDeLaFormeGeometrique){
        for (FormeGeometrique forme: formeGeometriques){
            if(forme.getNOMDELAFORME().equalsIgnoreCase(nomDeLaFormeGeometrique)){
                return forme;
            }
        }
        return null;
    }

    /**
     * Methode pour ajouter une forme géométrique au canvas
     * @param formeGeometrique
     * @throws FormeDejaExistanteException
     */
    public void ajouterFormeGeometrique(FormeGeometrique formeGeometrique) throws FormeDejaExistanteException {
        FormeGeometrique f= rechercheFormeGeometriqueWithStream(formeGeometrique.getNOMDELAFORME());
        if(f!=null){
             throw new FormeDejaExistanteException("Une forme avec ce nom existe deja");
        }
        formeGeometriques.add(formeGeometrique);
    }

    /**
     * Methode permettant de pelacer une forme dans le canvas
     * @param nomDeLaForme
     * @param deplacementX
     * @param deplacementY
     * @throws ErreurDeplacementException
     */
    public void deplacerForme(String nomDeLaForme, float deplacementX, float deplacementY) throws ErreurDeplacementException {
        FormeGeometrique f = rechercheFormeGeometriqueWithStream(nomDeLaForme);
        if (f == null) {
            throw new ErreurDeplacementException("La forme géométrique n'existe pas");
        }
        float nouveauX = f.getX() + deplacementX;
        float nouveauY = f.getY() + deplacementY;
        if (nouveauX > largeur || nouveauY > longueur) {
            throw new ErreurDeplacementException("Le déplacement n'est pas possible");
        }
        f.setX(nouveauX);
        f.setY(nouveauY);
    }

    /**
     * Methode pour calculer la surface totale de toutes les formes du canvas
     * @return
     */
    public float calculSurfaceTotale(){
        float surfaceTotale = 0;
        for(FormeGeometrique forme:formeGeometriques){
            surfaceTotale += forme.calculSurface();
        }
        return surfaceTotale;
    }

    /**
     * Votre méthode toString actuelle a pour but d'afficher des informations sur un objet Canvas ainsi que sur
     * les objets FormeGeometrique qu'il contient. Cependant, il y a un problème potentiel dans la façon dont
     * vous concaténez les informations des formes géométriques dans detailFormeGeometrique. Actuellement, seule
     * la dernière forme géométrique de la liste sera incluse dans la chaîne de caractères finale, car detailFormeGeometrique
     * est réinitialisée à chaque itération.
     *
     * Pour corriger cela, vous devez accumuler les informations de chaque FormeGeometrique dans
     * detailFormeGeometrique pendant la boucle. Voici comment vous pouvez le faire :
     *
     *
     *
     * Explications des Modifications :
     * Utilisation de StringBuilder :
     *
     * StringBuilder est plus efficace pour la concaténation de chaînes dans une boucle, car il évite de créer
     * plusieurs objets String inutiles.
     * La méthode append de StringBuilder ajoute chaque résultat de formeGeometrique.afficheAttribut() à la chaîne finale.
     * Ajout de \n :
     *
     * J'ai ajouté \n pour séparer visuellement chaque forme géométrique sur une nouvelle ligne.
     * Correction de la Concaténation :
     *
     * Le contenu de detailFormeGeometrique n'est plus écrasé à chaque itération. Au lieu de cela,
     * chaque détail est ajouté à la suite des précédents.
     * Résultat :
     * Cette version de toString va retourner une chaîne qui comprend à la fois les informations sur
     * l'objet Canvas et une liste détaillée de chaque FormeGeometrique qu'il contient, chacune étant séparée sur une nouvelle ligne.
     * @return
     */
    @Override
    public String toString() {
/*
        String infosCanva = "Canvas{" +
                "titre='" + titre + '\'' +
                ", longueur=" + longueur +
                ", largeur=" + largeur +
                ", formeGeometriques=" + formeGeometriques +
                '}';
        String detailFormeGeometrique ="";
        for(FormeGeometrique formeGeometrique:formeGeometriques){
             detailFormeGeometrique = formeGeometrique.afficheAttribut();
          }
        return infosCanva +"\n"+ detailFormeGeometrique;
*/


        String infosCanva = "Canvas{" +
                "titre='" + titre + '\'' +
                ", longueur=" + longueur +
                ", largeur=" + largeur +
                ", formeGeometriques=" + formeGeometriques +
                '}';

        // Accumuler les détails des formes géométriques
        StringBuilder detailFormeGeometrique = new StringBuilder();
        for (FormeGeometrique formeGeometrique : formeGeometriques) {
            detailFormeGeometrique.append(formeGeometrique.afficheAttribut()).append("\n");
        }

        return infosCanva + "\n" + detailFormeGeometrique.toString();
    }
}
