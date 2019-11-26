package shapes;

import util.Input;

public class CircleApp {

        public static void main(String[] args) {
            System.out.println("What is the radius of the circle?");
            Input input = new Input();
            Circle circle = new Circle(input.getDouble());
            System.out.println("The area is: "+circle.getArea());
            System.out.println("The circumference is: "+circle.getCircumference());
        }
    }
