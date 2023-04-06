<<<<<<< HEAD
public class Guiter implements Instrument {

    private int numberOfStrings;
    public Guiter(int numberOfStrings){
        this.numberOfStrings=numberOfStrings;
    }
    public int getNumberOfStrings() {
        return numberOfStrings;
    }
    public void setNumberOfStrings(int numberOfStrings) {
        this.numberOfStrings = numberOfStrings;
    }
    @Override
    public void play() {
        System.out.println("Играет гитара, у нее "+getNumberOfStrings() +" cтрун" );
    }
}
=======
public class Guiter implements Instrument {

    private int numberOfStrings;
    public Guiter(int numberOfStrings){
        this.numberOfStrings=numberOfStrings;
    }
    public int getNumberOfStrings() {
        return numberOfStrings;
    }
    public void setNumberOfStrings(int numberOfStrings) {
        this.numberOfStrings = numberOfStrings;
    }
    @Override
    public void play() {
        System.out.println("Играет гитара, у нее "+getNumberOfStrings() +" cтрун" );
    }
}
>>>>>>> 724ef885a160efad6423c02e8313f600c3905f11
