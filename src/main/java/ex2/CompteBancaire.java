package ex2;

/**
 * Représente un compte bancaire de type compte courante ou livret A
 */
public class CompteBancaire {

    /**
     * solde : solde du compte
     */
    private double solde;

    /**
     * decouvert : un découvert est autorisé seulement pour les comptes courants
     */
    private double decouvert;

    /**
     * tauxRemuneration : taux de rémunération dans le cas d'un livret A
     */
    protected double tauxRemuneration;

    public enum TypeCompte {
        COURANT,
        LIVRET_A
    }
    /**
     * Le type vaut soit courant, ou soit Livret A
     */
    private TypeCompte type;

    /**
     * @param type
     * @param solde
     */
    public CompteBancaire(TypeCompte type, double solde) {
        this.type = type;
        this.solde = solde;
        this.decouvert = decouvert;
    }

    /**
     * Ajoute un montant au solde
     *
     * @param montant
     */
    public void ajouterMontant(double montant) {
        this.solde += montant;
    }

    /**
     * Débiter un montant au solde
     *
     * @param montant
     */
    public void debiterMontant(double montant) {
        if (type == TypeCompte.COURANT) {
            if (this.solde - montant >=  -decouvert) {
                this.solde -= montant;
            }
        } else if (type.equals(TypeCompte.LIVRET_A)) {
            if (this.solde - montant >= 0) {
                this.solde -= montant;
            }
        }
    }

   public void appliquerRemuAnnuelle() {
        if (type == TypeCompte.LIVRET_A) {
            this.solde += solde * tauxRemuneration / 100;
        }
    }

    /**
     * Getter for solde
     *
     * @return the solde
     */
    public double getSolde() {
        return solde;
    }

    /**
     * Setter
     *
     * @param solde the solde to set
     */
    public void setSolde(double solde) {
        this.solde = solde;
    }

    /**
     * Getter for decouvert
     *
     * @return the decouvert
     */
    public double getDecouvert() {
        return decouvert;
    }

    /**
     * Setter
     *
     * @param decouvert the decouvert to set
     */
    public void setDecouvert(double decouvert) {
        this.decouvert = decouvert;
    }

    /**
     * Getter for tauxRemuneration
     *
     * @return the tauxRemuneration
     */
    public double getTauxRemuneration() {
        return tauxRemuneration;
    }

    /**
     * Setter
     *
     * @param tauxRemuneration the tauxRemuneration to set
     */
    public void setTauxRemuneration(double tauxRemuneration) {
        this.tauxRemuneration = tauxRemuneration;
    }

    /**
     * Getter for type
     *
     * @return the type
     */
    public TypeCompte getType() {
        return type;
    }

    /**
     * Setter
     *
     * @param type the type to set
     */
    public void setType(TypeCompte type) {
        this.type = type;
    }
}
