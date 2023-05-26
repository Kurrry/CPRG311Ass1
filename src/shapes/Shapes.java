package shapes;


public abstract class Shapes implements Comparable<Shapes> {

    double height;

    protected double calcVolume() {
        return 0;
    }

    protected double calcBaseArea() {
        return 0;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public int compareTo(Shapes s) {
        return Double.compare(this.getHeight(), s.getHeight());
    }
}
