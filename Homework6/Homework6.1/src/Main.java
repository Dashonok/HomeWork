import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Animal> arrays= Arrays.asList(new Cat("Тося", 5), new Dog("Оливер", 10), new Rat("Мира", 3));
        for (Animal val: arrays){
            System.out.println(val.getAnimalType()+" "+val.getName()+ " производит звук: "+val.makeNoise());
        }
    }
}