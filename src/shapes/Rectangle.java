package shapes;

public class Rectangle extends Quadrilateral implements Measurable {
    public Rectangle(int Width, int Length) {
        super(Width, Length);
    }

    @Override
    public void setLength(int Length) {

    }

    @Override
    public void setWidth(int Width) {

    }

    @Override
    public double getPerimeter() {
        return 0;
    }

    @Override
    public double getArea() {
        return 0;
    }
}


//public class Rectangle {
//
//    protected int length;
//    protected int width;
//
//    public Rectangle(int Length, int Width){
//        this.length = Length;
//        this.width = Width;
//    }
//
//    public int getArea(){
//        return this.length * this.width;
//    }
//
//    public int getPerimeter(){
//        return 2 * this.length + 2 * this.width;
//    }
//
//}
