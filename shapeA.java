abstract class Shape {
    abstract void NOS();
}

class triangle extends Shape {
    void NOS() {
        System.out.println("No of sides of triangle is 3");
    }
}

class rectangle extends Shape {
    void NOS() {
        System.out.println("No of sides of rectangle is 4");
    }
}

public class shapeA {
    public static void main(String args[]) {
        triangle t = new triangle();
        rectangle r = new rectangle();
        t.NOS();
        r.NOS();
    }

}
