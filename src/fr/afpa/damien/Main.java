package fr.afpa.damien;

/**
 * The type Main.
 */
public class Main {

    /**
     * The Tableau.
     */
    static int[] tableau;
    /**
     * The Resultat.
     */
    static int resultat;

    /**
     * Get tab int [ ].
     *
     * @return the int [ ]
     */
    public static int[] getTab() {
        return tableau;
    }

    /**
     * Sets tab.
     *
     * @param tab the tab
     */
    public static void setTab(int[] tab) {
        tableau = tab;
    }

    /**
     * Gets max.
     *
     * @return the max
     */
    public static int getMax() {
        return resultat;
    }

    /**
     * Sets max.
     *
     * @param max the max
     */
    public static void setMax(int max) {
        resultat = max;
    }

    /**
     * The entry point of application.
     *
     * @param args the input arguments
     * @author Damien Gruffeille
     */
    public static void main(String[] args) {
        setTab(Utils.tableau());
        Utils.afficherTableau(getTab());
        setMax(Utils.maximum(getTab()));
        Utils.afficherResultat(getMax());
    }
}
