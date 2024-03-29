

public class SpiderMan extends SuperHeroes {

    //TODO: Sadece SpiderMan'e has String tipinde bir özellik (field) tanımlayın
    private String webShootingAbility;


    ///////////////////////////////////////////////////////////////////////
    public SpiderMan(String name, String gender, String aggression, String wisdom, String beauty, String webShootingAbility) {
        super(name, gender, aggression, wisdom, beauty);
        setWebShootingAbility(webShootingAbility);


   }
    public String getWebShootingAbility() {
        return webShootingAbility;
    }

    public void setWebShootingAbility(String webShootingAbility) {
        this.webShootingAbility = webShootingAbility;
    }

    @Override
    public void attack() {
        //TODO: SuperHero sınıfının atack() metodunu uygulayın >> super.attack() gibi...
        // Örümcek adamın ismiyle beraber extra attack özelliğini konsola yazdırın...
        //"Ayrıca, " + getName() + "örümcek ağı püskürtme yeteneği ile saldırabilir ve düşmanlarını etkisiz hale getirebilir."
        super.attack();
        System.out.println(getName() + ", örümcek ağı püskürtme yeteneği ile saldırabilir ve düşmanlarını etkisiz hale getirebilir.");




    }

    @Override
    public void exposeSecretPower() {
        //TODO: Bu metod çağrıldığında, örümcek adama has özelliği sadece konsola yazdırın.
        // getName() + ", örümcek ağı püskürtme yeteneğine sahiptir."

        System.out.println(getName() + ", örümcek ağı püskürtme yeteneğine sahiptir.");



    }

    @Override
    public void printInfo() {
        super.printInfo();
        //TODO: Bu metod çağrıldığında, tüm kahramanların özelliği yazdırıldığı gibi, konsola özrümcek adama has özelliği de yazdırın (@Override sayesinde)...

        System.out.println("Spider Man'e has özelliği, " +webShootingAbility);


    }
}
