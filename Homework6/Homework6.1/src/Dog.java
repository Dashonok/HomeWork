public class Dog extends Animal{
    public Dog(String name, int age) {
        super(name, age);
        setAnimalType("Собака");
    }

    @Override
    public String makeNoise() {

        return "Гав";
    }
}
