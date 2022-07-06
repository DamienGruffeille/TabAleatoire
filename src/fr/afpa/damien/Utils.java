package fr.afpa.damien;

import javax.swing.*;
import java.util.Arrays;
import java.util.Random;

/**
 * The type Utils.
 */
public class Utils {

    /**
     * Tableau int [ ].
     *
     * @return the int [ ]
     */
    public static int[] tableau() {
        int[] tab = new int[15];

        for (int i = 0; i < tab.length; i++) {
            Random random = new Random();
            tab[i] = random.nextInt(21);
        }
        System.out.println(Arrays.toString(tab));
        return tab;
    }

    /**
     * Maximum int.
     *
     * @param tab the tab
     * @return the int
     */
    public static int maximum(final int[] tab) {
        int max = tab[0];

        for (int j = 1; j < tab.length; j++) {

            if (max < tab[j]) {
                max = tab[j];
            }

            //System.out.println(max);
        }
        System.out.println("Le nombre max est :" + max);
        return max;
    }

    /**
     * Afficher tableau.
     *
     * @param tab the tab
     */
    public static void afficherTableau(final int[] tab) {

        JOptionPane.showMessageDialog(
                null,
                "<html>Voici le tableau aléatoire généré :<br>" + Arrays.toString(tab) + "</html>",
                "Tableau de recherche",
                JOptionPane.INFORMATION_MESSAGE);

    }

    /**
     * Afficher resultat.
     *
     * @param max the max
     */
    public static void afficherResultat(final int max) {

        JOptionPane.showMessageDialog(
                null,
                "<html>L'entier maxi dans le tableau est :<br>" + max + "</html>",
                "Nombre max",
                JOptionPane.INFORMATION_MESSAGE);

    }
}
