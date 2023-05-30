package shapes;

public class Cone extends RoundShapes{
    public Cone(double height, double radius) {
        this.setHeight(height);
        this.setRadius(radius);
    }

    @Override
    public double calcVolume() {
        return ((double) 1 / 3) * super.calcVolume();
    }

    public String toString() {
        return "Cone";
    }
}
