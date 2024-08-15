package exceptions;

import formesGeometriques.FormeGeometrique;

/**
 * Cette classe FormeDejaExistanteException représente ...
 *
 * @author Utilisateur
 * @version 1.0
 */
public class FormeDejaExistanteException extends Exception {
    public FormeDejaExistanteException(String message) {
        super(message);
    }
}
