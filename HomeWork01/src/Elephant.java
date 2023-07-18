public class Elephant extends Animal {
    private String bigEars;
    private String trunk;


    public Elephant(String nameAnimal, String ownerName, String diagnosis, Boolean isVaccinated, String bigEars, String trunk) {
        super(nameAnimal, ownerName, diagnosis, isVaccinated);
        this.bigEars = bigEars;
        this.trunk = trunk;
    }

    public String getBigEars() {
        return bigEars;
    }
      public String getTrunk() {
        return trunk;
    }

    @Override
    public String skil() {
        System.out.println((char)27+ "[31m");
        toGo();
        swim();
        return "";
    }
}
