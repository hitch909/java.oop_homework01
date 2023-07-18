import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {


    public static void main(String[] args) {
        Animal hathy = new Elephant("Хатхи", "Маугли", "Здоров", false, "bigEars", "trunk");
        Animal flipper = new Dolphin("flipper", null, "здоров", true, "Ольга");
        Animal winter = new Dolphin("Уинтер", null, null, false, "Елена");
        Animal hugin = new Raven("Хугин", "Odin", null, false, true, true);

      List<Animal>animals = new ArrayList<>(Arrays.asList(hathy, flipper, winter, hugin));

        for (Animal animal : animals) {
            System.out.println(animal);
        }

        System.out.println("меня зовут Хугин" + hugin.skil());
        System.out.println("меня зовут Хатхи" + hathy.skil());
        System.out.println("меня зовут Флиппер" + flipper.skil());
        System.out.println("меня зовут Уинтер" + winter.skil());
    }
}