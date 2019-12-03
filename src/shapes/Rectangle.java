package shapes;

public class Rectangle {
    protected int length;
    protected int width;

    public Rectangle(int Length, int Width){
        this.length = Length;
        this.width = Width;
    }

    public int getArea(){
        return this.length * this.width;
    }

    public int getPerimeter(){
        return 2 * this.length + 2 * this.width;
    }

}
