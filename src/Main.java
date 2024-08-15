import exceptions.ErreurDeplacementException;

import exceptions.FormeDejaExistanteException;
import formesGeometriques.*;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args){
        System.out.println("--------------------------CONCEPTION CANVAS DE FORMES GEOMETRIQUES------------------------------");

        CercleColorie cercleColorie1 = new CercleColorie(5,10,"cercle Colorie1",4,"bleu");
        CercleColorie cercleColorie2 = new CercleColorie(15,20,"cercle Colorie2",14,"rouge");

        CercleEpais cercleEpais1 = new CercleEpais(8,88,"Cercle epais1",9,2);
        CercleEpais cercleEpais2 = new CercleEpais(18,98,"Cercle epais2",19,22);

        RectangleColorie rectangleColorie1 = new RectangleColorie(6,94,"Rectangle colorie1",4,2,"vert");
        RectangleColorie rectangleColorie2 = new RectangleColorie(6,15,"Rectangle colorie2",14,5,"jaune");

        RectangleEpais rectangleEpais1 = new RectangleEpais(16,54,"Rectangle epais1",4,2,7);
        RectangleEpais rectangleEpais2 = new RectangleEpais(26,15,"Rectangle epais2",14,5,10);




        System.out.println("------------LES ATTRIBUTS DES FOREMES GEOMETRIQUES CREES------------");
        System.out.println("attributs cercleColorie1: "+ cercleColorie1.afficheAttribut());
        System.out.println("attributs cercleColorie2: "+ cercleColorie2.afficheAttribut());
        System.out.println("attributs cercleEpais1: "+ cercleEpais1.afficheAttribut());
        System.out.println("attributs cercleEpais2: "+ cercleEpais2.afficheAttribut());
        System.out.println("attributs rectangleColorie1: "+ rectangleColorie1.afficheAttribut());
        System.out.println("attributs rectangleColorie2: "+ rectangleColorie2.afficheAttribut());
        System.out.println("attributs rectangleEpais1: "+ rectangleEpais1.afficheAttribut());
        System.out.println("attributs rectangleEpais2: "+ rectangleEpais2.afficheAttribut());
        System.out.println("------------SURFACE------------");
        System.out.println("surface cercleColorie1: "+ cercleColorie1.calculSurface());
        System.out.println("surface cercleColorie2: "+ cercleColorie2.calculSurface());
        System.out.println("surface cercleEpais1: "+ cercleEpais1.calculSurface());
        System.out.println("surface cercleEpais2: "+ cercleEpais2.calculSurface());
        System.out.println("surface rectangleColorie1: "+ rectangleColorie1.calculSurface());
        System.out.println("surface rectangleColorie2: "+ rectangleColorie2.calculSurface());
        System.out.println("surface rectangleEpais1: "+ rectangleEpais1.calculSurface());
        System.out.println("surface rectangleEpais2: "+ rectangleEpais2.calculSurface());
        System.out.println("------------PERIMETRE------------");
        System.out.println("perimetre cercleColorie1: "+ cercleColorie1.calculPerimetre());
        System.out.println("perimetre cercleColorie2: "+ cercleColorie2.calculPerimetre());
        System.out.println("perimetre cercleEpais1: "+ cercleEpais1.calculPerimetre());
        System.out.println("perimetre cercleEpais2: "+ cercleEpais2.calculPerimetre());
        System.out.println("perimetre rectangleColorie1: "+ rectangleColorie1.calculPerimetre());
        System.out.println("perimetre rectangleColorie2: "+ rectangleColorie2.calculPerimetre());
        System.out.println("perimetre rectangleEpais1: "+ rectangleEpais1.calculPerimetre());
        System.out.println("perimetre rectangleEpais2: "+ rectangleEpais2.calculPerimetre());


        System.out.println("----------------------------CANVAS------------------------");
        List<FormeGeometrique> formeGeometriques = new ArrayList<>();
        formeGeometriques.add(cercleColorie2);
        formeGeometriques.add(rectangleEpais2);


        Canvas canvas = new Canvas("mon canvas",500,500,formeGeometriques);
            try {
                canvas.ajouterFormeGeometrique(cercleColorie1);
                canvas.ajouterFormeGeometrique(rectangleEpais1);
            }catch (FormeDejaExistanteException e) {
                e.printStackTrace();
            }
            try {
                canvas.deplacerForme(cercleColorie1.getNOMDELAFORME(), 10, 10);
            } catch (ErreurDeplacementException exception) {
                exception.printStackTrace();
            }

            System.out.println("information du canvas: " + canvas);
            System.out.println("Nombre total de forme dans le canvas: " + canvas.getFormeGeometriques().size());
            System.out.println("La surface totale de: " + canvas.calculSurfaceTotale());

        }



}
