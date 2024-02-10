
public class WonderWoman extends SuperHeroes {
    private String lassoOfTruthAbility;

    public WonderWoman(String name, String gender, String aggression, String wisdom, String beauty, String lassoOfTruthAbility) {
        super("Wonder Woman", "Kadın", "800", "1000", "950");
        setLassoOfTruthAbility("Doğruluk Kementi");

    }

    public String getLassoOfTruthAbility() {
        return lassoOfTruthAbility;
    }

    public void setLassoOfTruthAbility(String lassoOfTruthAbility) {        this.lassoOfTruthAbility = lassoOfTruthAbility;


    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Wonder Woman'ın Özelliği = " + lassoOfTruthAbility);
    }

    @Override
    public void attack() {
        super.attack();
        System.out.println(getName() + "Wonder Woman'ın Kılıcı Vardır Ve Kılıcı İle Saldırır. ");

    }

    @Override
    public void exposeSecretPower() {
        super.exposeSecretPower();
        System.out.println("Bilekliklerini Birbirine Vurunca Sismik Dalga Yaratır.");
    }
}
