package ex3;

import java.util.ArrayList;
import java.util.List;

public class Zoo {

    private String nom;
    private List<String> types;
    private List<String> noms;
    private List<String> comportements;

    public Zoo(String nom) {
        this.nom = nom;
        this.types = new ArrayList<>();
        this.noms = new ArrayList<>();
        this.comportements = new ArrayList<>();
    }

    public void addAnimal(String nomAnimal, String typeAnimal, String comportement) {
        types.add(typeAnimal);
        noms.add(nomAnimal);
        comportements.add(comportement);
    }

    public void afficherListeAnimaux() {
        for (int i = 0; i < types.size(); i++) {
            System.out.println(noms.get(i) + " " + types.get(i) + " " + comportements.get(i));
        }
    }

    public int taille() {
        return types.size();
    }

    /**
     * Getter for nom
     *
     * @return the nom
     */
    public String getNom() {
        return nom;
    }

    /**
     * Setter
     *
     * @param nom the nom to set
     */
    public void setNom(String nom) {
        this.nom = nom;
    }
}
