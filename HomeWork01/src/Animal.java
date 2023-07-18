//Животное для вет. клиники
public abstract class Animal {
    protected String nameAnimal; // Кличка животного
    protected String ownerName; // Имя хозяина
    protected String diagnosis;
    protected Boolean isVaccinated;

    protected final String TYPE = getClass().getSimpleName();

    public Animal(String nameAnimal, String ownerName, String diagnosis, Boolean isVaccinated) {
        this.nameAnimal = nameAnimal;
        this.ownerName = ownerName;
        this.diagnosis = diagnosis;
        this.isVaccinated = isVaccinated;

    }

    public Boolean getVaccinated() {
        return isVaccinated;
    }

    public void setVaccinated(Boolean vaccinated) {
        isVaccinated = vaccinated;
    }


    public String getTYPE() {
        return TYPE;
    }


    @Override
    public String toString() {
        return String.format("%s { name = %s, owner = %s}", TYPE , nameAnimal, ownerName);
    }

   protected void swim() {
        System.out.println("Я умею плавать");
   }


    protected void fly() {
        System.out.println("Я умею летать");

    }

    protected void speak(){
        System.out.println("я умею говорить");
    }

    protected void toGo(){
        System.out.println("я умею бегать");
    }

    public abstract String skil();
}