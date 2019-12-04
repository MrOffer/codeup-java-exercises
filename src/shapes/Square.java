package shapes;

public class Square extends Quadrilateral{


    public Square(int Width, int Length) {
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

//public class Square extends Rectangle {
//    public Square(int Side){
//        super(Side,Side);
//    }
//
//    @Override
//    public int getArea() {
//        return super.length * super.width;
//    }
//
//    @Override
//    public int getPerimeter() {
//        return 4 * super.length;
//    }
//}
