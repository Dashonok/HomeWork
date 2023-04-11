class IncorrectInfoException extends Exception{
    private int age;
    private String name;
    public IncorrectInfoException(String message, int age, String name){
        super(message);
        this.age=age;
        this.name=name;
    }
    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setAge(int age) {
        this.age = age;
    }
}
