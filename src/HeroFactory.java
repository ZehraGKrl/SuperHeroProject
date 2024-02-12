
public class HeroFactory {

     // TODO BU CLASS'TA BİR DEĞİŞİKLİK YAPMANIZA GEREK YOK
    public SuperHeroes produceSuperHero(String superHero) {

        if (superHero.equalsIgnoreCase("Superman")) {
            return new Superman("Superman", "erkek", "1000", "800", "900", "Supersonic Flight");
        } else if (superHero.equalsIgnoreCase("Wonder Woman")) {
            return new WonderWoman("Wonder Woman", "kadın", "800", "1000", "950", "Lasso of Truth");
        } else if (superHero.equalsIgnoreCase("Spider Man")) {
            return new SpiderMan("Spider Man", "erkek", "700", "750", "800", "Web Shooting");
        } else if (superHero.equalsIgnoreCase("Batman")) {
            return new Batman("Batman", "erkek", "900", "950", "850", "Detective Skills");
        } else if (superHero.equalsIgnoreCase("Wolverine")) {
            return new Wolverine("Wolverine", "erkek", "950", "700", "800", "Adamantium Claws");
        } else {
            return null;
        }
    }
}

