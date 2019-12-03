package shapes;

public class Rectangle {
    protected int length;
    protected int width;

    public int getArea(){
      return length * width;
    }

    public int getPerimeter(){
        return 2 * length + 2 * width;
    }

}
