import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        int capacote = lireCapacite();
        double ph = lireNiveauPh();
        double chlore = lireChloreLibre();
        double alcalinite = lireAlcalinite();
        double durete = lireDureteCalcique();

        System.out.println("1. Augmenter la dureté calcique de 250,0 ppm avec 20,6 kg de chlorure de calcium");
    }

    public static int lireCapacite() {
        System.out.print("Capacité de la piscine (en litres) : ");
        return new Scanner(System.in).nextInt();
    }

    public static double lireNiveauPh() {
        System.out.print("Niveau de pH [7.2 - 7.6] : ");
        return new Scanner(System.in).nextDouble();
    }

    public static double lireChloreLibre() {
        System.out.print("Chlore libre [2 - 4 ppm] : ");
        return new Scanner(System.in).nextDouble();
    }

    public static double lireAlcalinite() {
        System.out.print("Alcalinité totale [80 - 120 ppm] : ");
        return new Scanner(System.in).nextDouble();
    }

    public static double lireDureteCalcique() {
        System.out.print("Dureté calcique [250 - 360 ppm] : ");
        return new Scanner(System.in).nextDouble();
    }
}