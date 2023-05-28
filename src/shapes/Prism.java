package shapes;

public abstract class Prism extends Shapes{
    double side;

    public double getSide() {
        return side;
    }

    @Override
    public double calcBaseArea() {
        return Math.pow(this.getSide(), 2);
    }

    public void setSide(double side) {
        this.side = side;
    }


}
