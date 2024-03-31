
import java.util.*;

public class Runner {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        List<String> activeHeroes = new ArrayList<>();
        List<String> allHeroes = new ArrayList<>();
        Collections.addAll(allHeroes, "Superman", "Batman", "Spider Man", "Wolverine", "Wonder Woman");


        while (true) {
            System.out.println("***** Süper Kahramanlar gösterisine hoş geldiniz *****");
            System.out.println("    ----------Mevcut Süper Kahramanlar----------" + "\n" + allHeroes + "\n");
            System.out.println("Hangi süper kahramanı eklemek istiyorsunuz?");
            System.out.println("Çıkış Yapmak isterseniz Q'ya basınız.");
            String secim = input.nextLine().toLowerCase();
            if (secim.equals("q")) {
                System.out.println("Süper kahraman dünyasından çıkış yaptınız. Görüşmek üzere...");
                break;
            }
            HeroFactory factory = new HeroFactory();
            SuperHeroes sk = factory.produceSuperHero(secim);
            if (sk != null) {
                activeHeroes.add(secim);
                sk.attack();
                sk.printInfo();
                sk.exposeSecretPower();

                boolean found = false;
                for (int i = 0; i < allHeroes.size(); i++) {
                    if (allHeroes.get(i).equalsIgnoreCase(secim)) {
                        found = true;
                        allHeroes.remove(i);
                        break;
                    }
                }

                System.out.println(secim + " oyuna başarıyla eklendi.");
                System.out.println("Aktif kahramanlar: " + activeHeroes);
                System.out.println("Oyuna girmemiş kahramanlar: " + getRemainingHeroes(allHeroes, activeHeroes));
            } else {
                System.out.println("Belirtilen isimde bir kahraman bulunamadı.");
            }

            if (activeHeroes.contains(secim)) {
                System.out.println(secim + " zaten oyunda aktif!");
            } else {
                System.out.println("Lütfen geçerli bir süper kahraman girin.");
            }

        }

    }

    private static List<String> getRemainingHeroes(List<String> allHeroes, List<String> activeHeroes) {
        List<String> remainingHeroes = new ArrayList<>(allHeroes);
        remainingHeroes.removeAll(activeHeroes);
        return remainingHeroes;
    }
}
