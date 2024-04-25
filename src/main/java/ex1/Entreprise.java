package ex1;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Cette classe représente une entreprise avec ses informations.
 */
public class Entreprise {

    /**
     * Capital maximum autorisé pour une entreprise.
     */
    public static final int CAPITAL_MAX = 3000000;

    /**
     * Numéro SIRET de l'entreprise.
     */
    public int siret;

    /**
     * Nom de l'entreprise.
     */
    public String nom;

    /**
     * Adresse de l'entreprise.
     */
    public String adresse;

    /**
     * Date de création de l'entreprise.
     */
    public Date dateCreation;

    /**
     * Affiche le statut de l'entreprise.
     */
    public void afficherStatut() {
        System.out.println("Informations de l'entreprise :");
        System.out.println("SIRET : " + siret);
        System.out.println("Nom : " + nom);
        System.out.println("Adresse : " + adresse);

        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        String dateCreationStr = dateFormat.format(dateCreation);
        System.out.println("Date de création : " + dateCreationStr);
    }

}