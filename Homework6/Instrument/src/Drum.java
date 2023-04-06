<<<<<<< HEAD
public class Drum implements Instrument{

    private double size;
    public Drum(double size){
        this.size=size;
    }
    public double getSize() {
        return size;
    }
    public void setSize(double size) {
        this.size = size;
    }
    @Override
    public void play() {
        System.out.println("Играет барабан, с размером: "+getSize());
    }
}
=======
public class Drum implements Instrument{

    private double size;
    public Drum(double size){
        this.size=size;
    }
    public double getSize() {
        return size;
    }
    public void setSize(double size) {
        this.size = size;
    }
    @Override
    public void play() {
        System.out.println("Играет барабан, с размером: "+getSize());
    }
}
>>>>>>> 724ef885a160efad6423c02e8313f600c3905f11
