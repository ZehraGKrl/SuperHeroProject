
public class WonderWoman extends SuperHeroes {
    private String lassoOfTruthAbility;

    public WonderWoman(String name, String gender, String aggression, String wisdom, String beauty, String lassoOfTruthAbility) {
        super(name, gender, aggression, wisdom, beauty);
        setLassoOfTruthAbility(lassoOfTruthAbility);

    }

    public String getLassoOfTruthAbility() {
        return lassoOfTruthAbility;
    }

    public void setLassoOfTruthAbility(String lassoOfTruthAbility) {
        this.lassoOfTruthAbility = lassoOfTruthAbility;


    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Wonder Woman'ın özelliği, " + lassoOfTruthAbility);
    }

    @Override
    public void attack() {
        super.attack();
        System.out.println("Wonder Woman'ın Kılıcı Vardır Ve Kılıcı İle Saldırır.");

    }

    @Override
    public void exposeSecretPower() {

        System.out.println(getName() + ", bilekliklerini birbirine vurunca sismik dalga yaratır.");
    }
}
