package ex5;

import java.util.ArrayList;
import java.util.List;

public class Inventaire {

    private List<Caisse> caisses;

    public Inventaire() {
        caisses = new ArrayList<>();
        caisses.add(new Caisse("Petits objets"));
        caisses.add(new Caisse("Moyens objets"));
        caisses.add(new Caisse("Grands objets"));
    }

    /**
     * Cette méthode ajoute les caisses si elles sont acceptées
     *
     * @param item the item to add
     */
    public void addItem(Item item) {
        for (Caisse caisse : caisses) {
            if (caisse.accepte(item)) {
                caisse.getItems().add(item);
                break;
            }
        }
    }

    /**
     * Cette méthode retourne la taille totale
     */
    public int taille() {
        int tailleTotale = 0;
        for (Caisse caisse : caisses) {
            tailleTotale += caisse.getItems().size();
        }
        return tailleTotale;
    }
}
