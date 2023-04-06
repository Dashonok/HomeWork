public class Rat extends Animal{
    public Rat(String name, int age) {
        super(name, age);
        setAnimalType("Крыса");
    }

    @Override
    public String makeNoise() {

        return "Пи-пи";
    }
}
