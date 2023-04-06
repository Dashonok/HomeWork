public abstract class Animal {
    private String name;
    private int age;
    private String animalType;
    public Animal(String name, int age){
        this.name=name;
        this.age=age;
    }

    public String getAnimalType(){
        return animalType;
    }
    public void setAnimalType(String animalType){
        this.animalType=animalType;
    }
    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }
    public abstract String makeNoise();

    }
