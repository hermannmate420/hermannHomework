package rockpaperscisors;

import java.util.*;

public class Rockpaperscisors {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Válassz: kő, papír vagy olló");
        String playerChoose = sc.nextLine().toLowerCase();

        if (playerChoose.equals("ko") || playerChoose.equals("papir") || playerChoose.equals("ollo")) {
            String botChoose = generatedA();
            System.out.println("A számítógép választása: " + botChoose);

            resultChoose(playerChoose, botChoose);
        } else {
            System.out.println("rossz választás. Csak kő, papír vagy ollót tudsz megadni:(");
        }
    }

    private static String generatedA() {
        String[] lehetsegesValasztasok = {"ko", "papir", "ollo"};
        int i = (int) (Math.random() * lehetsegesValasztasok.length); // --> Math.random helped by google :)
        return lehetsegesValasztasok[i];
    }

    private static void resultChoose(String player, String bot) {
        if (player.equals(bot)) {
            System.out.println("Döntetlen!");
        } else if ((player.equals("ko") && bot.equals("ollo")) || (player.equals("papir") && bot.equals("ko")) || (player.equals("ollo") && bot.equals("papir"))) {
            System.out.println("Gratulálok, nyertél!");
        } else {
            System.out.println("Sajnálom, vesztettél. Próbáld újra!");
        }
    }
}
