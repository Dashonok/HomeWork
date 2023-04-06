public class Cat extends Animal{

    public Cat(String name, int age) {
        super(name, age);
        setAnimalType("Кошка");
    }

    @Override
    public String makeNoise() {
        return "Мяу";
    }
}
