package shapes;

public abstract class RoundShapes extends Shapes{
    double radius;

    public double getRadius() {
        return radius;
    }

    @Override
    public double calcBaseArea() {
        return Math.PI * Math.pow(this.getRadius(), 2);
    }

    @Override
    public double calcVolume() {
        return this.calcBaseArea() * this.getHeight();
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
}
