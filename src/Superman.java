

public class Superman extends SuperHeroes{
    private String flyingAbility;
    public Superman(String name, String gender, String aggression, String wisdom, String beauty, String flyingAbility) {
        super(name, gender, aggression, wisdom, beauty);
        setFlyingAbility(flyingAbility);
    }


    public String getFlyingAbility() {
        return flyingAbility;
    }

    public void setFlyingAbility(String flyingAbility) {
        this.flyingAbility = flyingAbility;
    }

    public void attack() {
        super.attack();
        System.out.println("Ayrıca,Superman uçarken Supersonic Flight güçlü saldırılar gerçekleştirebilir.");


    }
    public void exposeSecretPower() {

        System.out.println(getName() + " Supersonic Flight hızında uçma yeteneğine sahiptir.");


    }
    public void printInfo() {
        super.printInfo();
        System.out.println("Superman'in özelliği, " +flyingAbility);


    }
}
