
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Runner {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        List<String> activeHeroes = new ArrayList<>();
        List<String> allHeroes = new ArrayList<>();
        Collections.addAll(allHeroes, "Superman", "Batman", "Spider-Man", "Wolverine", "WonderWoman");


////////////////////////////////////////////////////////////////////////////////////
        // TODO: Tüm Süper Kahramanları allHeros listesine ekleyin.


        ////////////////////////////////////////////////////////////////////////////////////
        // TODO Kullanıcıya mevcut tüm süper kahramanları göstererek, asagidaki menuyu olusturun
        //      "Süper Kahramanlar gösterisine hoş geldiniz..."
        //      "Mevcut Süper Kahramanlar: " + allHeroes
        //       "Çıkmak için q'ya basın..."

        while (true) {
            System.out.println("***** Süper Kahramanlar gösterisine hoş geldiniz *****");
            System.out.println("    ----------Mevcut Süper Kahramanlar----------" + "\n"+ allHeroes + "\n" );
            System.out.println("Hangi süper kahramanı eklemek istiyorsunuz?");
            System.out.println("Çıkış Yapmak isterseniz Q'ya basınız.");
            String cikis = input.nextLine();
            if (cikis.equalsIgnoreCase("q")) {
                System.out.println("Süper Kahraman dünyasından çıkış yaptınız. Görüşmek üzere...");
                break;
            }

        }


        ////////////////////////////////////////////////////////////////////////////////////
        // TODO Kullaniciya "Hangi süper kahramanı eklemek istiyorsunuz? " sorusunu sorarak tercihini alin


        //TODO: Eğer girilen isim allHeros listesinde var da, activeHeroes listesinde yoksa : "... oyuna başarıyla eklendi." yazın;
        // oyunda aktif olan ve oyuna girmemiş tüm kahramanları yazdırın...

        //TODO: Eğer girilen isim activeHeroes listesinde varsa "... zaten oyunda aktif!" yazın;

        //TODO: Eğer girilen isim allHeros listesinde de activeHeroes listesinde de yoksa : "... Lütfen geçerli bir süper kahraman girin..." yazın;

        //NOT: getRemainingHeroes(){} metodunu oyuna girmemiş kahramanlar için kullanabilirsiniz...
    }


    // TODO Bu methodda bir degisiklik yapmayiniz
    private static List<String> getRemainingHeroes(List<String> allHeroes, List<String> activeHeroes) {
        List<String> remainingHeroes = new ArrayList<>(allHeroes);
        remainingHeroes.removeAll(activeHeroes);
        return remainingHeroes;
    }
}
