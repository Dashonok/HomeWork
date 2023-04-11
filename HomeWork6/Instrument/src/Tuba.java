<<<<<<< HEAD
public class Tuba implements Instrument{

    private double diameter;
    public Tuba(double diameter){
        this.diameter=diameter;
    }
    public double getDiameter() {
        return diameter;
    }
    public void setDiameter(double diameter) {
        this.diameter = diameter;
    }
    @Override
    public void play() {
        System.out.println("Играет туба, у которой диаметр: "+getDiameter());
    }
}
=======
public class Tuba implements Instrument{

    private double diameter;
    public Tuba(double diameter){
        this.diameter=diameter;
    }
    public double getDiameter() {
        return diameter;
    }
    public void setDiameter(double diameter) {
        this.diameter = diameter;
    }
    @Override
    public void play() {
        System.out.println("Играет туба, у которой диаметр: "+getDiameter());
    }
}
>>>>>>> 724ef885a160efad6423c02e8313f600c3905f11
