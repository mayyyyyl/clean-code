package ex2;

public class LivretA extends CompteBancaire {

    public LivretA(TypeCompte type, double solde, double tauxRemuneration) {
        super(TypeCompte.LIVRET_A, solde);

        this.tauxRemuneration = tauxRemuneration;
    }
}
