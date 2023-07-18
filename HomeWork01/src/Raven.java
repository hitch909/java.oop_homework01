public class Raven extends Animal {
    private boolean wings;
    private  boolean beak;

    public Raven(String nameAnimal, String ownerName, String diagnosis, Boolean isVaccinated, boolean wings, boolean beak) {
        super(nameAnimal, ownerName, diagnosis, isVaccinated);
        this.wings = wings;
        this.beak = beak;
    }

    public boolean isWings() {
        return wings;
    }

    public boolean isBeak() {
        return beak;
    }

    @Override
    public String skil(){
        System.out.println((char)27+ "[33m");
        speak();
        fly();
        return "";
    }
}
