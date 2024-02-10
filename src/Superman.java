

public class Superman extends SuperHeroes{
    private String flyingAbility;
    public Superman(String name, String gender, String aggression, String wisdom, String beauty, String flyingAbility) {
        super("Superman", "erkek", "1000", "800", "900");
        setFlyingAbility("Supersonic Flight");
    }


    public String getFlyingAbility() {
        return flyingAbility;
    }

    public void setFlyingAbility(String flyingAbility) {
        this.flyingAbility = flyingAbility;
    }

    public void attack() {
        super.attack();
        System.out.println("Ayrıca," + getName() + "Superman uçarken Supersonic Flight-güçlü saldırılar gerçekleştirebilir.");


    }
    public void exposeSecretPower() {
        super.exposeSecretPower();
        System.out.println(getName() + "Supersonic Flight hızında uçma yeteneğine sahiptir.");


    }
    public void printInfo() {
        super.printInfo();
        System.out.println("Superman özelliği " +flyingAbility);


    }
}
