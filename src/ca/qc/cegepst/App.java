package ca.qc.cegepst;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        /*
          Il doit y avoir UNE seul instance de Scanner dans le projet pour
          s'assurer que le buffer reste bon avec Classroom.
         */
        Scanner scanner = new Scanner(System.in);

        int capacote = lireCapacite(scanner);
        double ph = lireNiveauPh(scanner);
        double chlore = lireChloreLibre(scanner);
        double alcalinite = lireAlcalinite(scanner);
        double durete = lireDureteCalcique(scanner);
        System.out.println("----------------------------------");
        System.out.println("1. Augmenter la dureté calcique de 250,0 ppm avec 20,6 kg de chlorure de calcium");
    }

    public static int lireCapacite(Scanner scanner) {
        /*
         * On utilise System.console() != null pour ne pas affecter les résultats
         * de sortie pour Classroom.
         */
        if (System.console() != null) {
            System.out.print("Capacité de la piscine (en litres) : ");
        }
        return scanner.nextInt();
    }

    public static double lireNiveauPh(Scanner scanner) {
        if (System.console() != null) {
            System.out.print("Niveau de pH [7.2 - 7.6] : ");
        }
        return scanner.nextDouble();
    }

    public static double lireChloreLibre(Scanner scanner) {
        if (System.console() != null) {
            System.out.print("Chlore libre [2 - 4 ppm] : ");
        }
        return scanner.nextDouble();
    }

    public static double lireAlcalinite(Scanner scanner) {
        if (System.console() != null) {
            System.out.print("Alcalinité totale [80 - 120 ppm] : ");
        }
        return scanner.nextDouble();
    }

    public static double lireDureteCalcique(Scanner scanner) {
        if (System.console() != null) {
            System.out.print("Dureté calcique [250 - 360 ppm] : ");
        }
        return scanner.nextDouble();
    }
}