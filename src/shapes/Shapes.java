package shapes;


public abstract class Shapes implements Comparable<Shapes> {

    double height;

    public double calcVolume() {
        return 0;
    }

    public double calcBaseArea() {
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
