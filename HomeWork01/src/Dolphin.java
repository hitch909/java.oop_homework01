public class Dolphin extends Animal{
    private final String nameCoach;

    public Dolphin(String nameAnimal, String ownerName, String diagnosis, Boolean isVaccinated, String nameCoach) {
        super(nameAnimal, ownerName, diagnosis, isVaccinated);
        this.nameCoach = nameCoach;
    }


    public String getNameCoach() {
        return nameCoach;
    }

    @Override
    public String skil() {
        System.out.println((char)27+ "[32m");
        swim();
        return "";
    }
}

