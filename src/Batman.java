
public class Batman extends SuperHeroes {

    private String detectiveSkillsAbility;
    public Batman(String name, String gender, String aggression, String wisdom, String beauty,String detectiveSkillsAbility) {
        super(name, gender, aggression, wisdom, beauty);
        setDetectiveSkillsAbility(detectiveSkillsAbility);
    }

    public String getDetectiveSkillsAbility() {
        return detectiveSkillsAbility;
    }

    public void setDetectiveSkillsAbility(String detectiveSkillsAbility) {
        this.detectiveSkillsAbility = detectiveSkillsAbility;
    }

    @Override
    public void attack() {
        super.attack();
        System.out.println("Ayrıca "+getName()+", dedektif becerileri ile saldirabilir ve düşmanlarını planlayarak alt edebilir");
    }
    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Batman'e has özelliği, "+detectiveSkillsAbility);

    }



    @Override
    public void exposeSecretPower() {

        System.out.println(getName()+", dedektif becerilerine sahiptir ve bu yetenegiyle suclulari yakalamda ustalasmistir");
    }


}
