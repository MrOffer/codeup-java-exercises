package shapes;

abstract class Quadrilateral extends Shape implements Measurable {
    protected int length;
    protected int width;

    public Quadrilateral(int Width, int Length) {
        length = Length;
        width = Width;
    }

    public int getLength() {
        return length;
    }

    public int getWidth() {
        return width;
    }

    public abstract void setLength(int Length);

    public abstract void setWidth(int Width);
}
