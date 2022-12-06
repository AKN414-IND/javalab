
public class areaol {
    float area(float l, float b) {
        return l * b;
    }

    float area(float r) {
        return 3.14f * r * r;
    }

    float area(float a, float b, float c) {
        return a * b * 0.5f;
    }

    public static void main(String args[]) {
        areaol a = new areaol();
        System.out.println("Area of rectangle is " + a.area(10, 20));
        System.out.println("Area of circle is " + a.area(10));
        System.out.println("Area of triangle is " + a.area(10, 20, 30));

    }

}
