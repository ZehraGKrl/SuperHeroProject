
public class Wolverine extends SuperHeroes {

    private String adamantiumClaws;

    public Wolverine(String name, String gender, String aggression, String wisdom, String beauty,String adamantiumClaws) {
        super("Wolverine", "Erkek", "950", "700", "800");
        setAdamantiumClaws("Adamantium Claws");
    }

    public String getAdamantiumClaws() {
        return adamantiumClaws;
    }

    public void setAdamantiumClaws(String adamantiumClaws) {
        this.adamantiumClaws = adamantiumClaws;
    }

    @Override
    public void attack() {
        super.attack();
        System.out.println("Ayrıca" + getName() + ", adamantium pençeleri ile saldırabilir" +
                " ve düşmanlarını hızla etkisiz hale getirebilir.");
    }

    @Override
    public void exposeSecretPower() {
        super.exposeSecretPower();
        System.out.println(getName() + ", adamantium pençeleri sahiptir ve " +
                "bu pençeleriyle her türlü maddeyi kesip parçalayabilir.");
    }
    public void printInfo() {
        super.printInfo();
        System.out.println("Wolverine'ne has özelliği, " +adamantiumClaws);


    }
    }

